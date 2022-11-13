package clesia;

import arc.Core;
import arc.Events;
import arc.func.Func;
import arc.scene.ui.ImageButton;
import arc.scene.ui.layout.Table;
import arc.util.Log;
import mindustry.game.EventType.ClientLoadEvent;
import mindustry.game.EventType.FileTreeInitEvent;
import mindustry.gen.Icon;
import mindustry.mod.Mod;
import mindustry.mod.Mods.LoadedMod;
import clesia.content.*;
import clesia.graphics.ClesiaShaders;
import clesia.system.SolarSystem;
import clesia.ui.dialogs.ClesiaDisclaimer;
import clesia.ui.dialogs.ClesiaDiscordLink;
import clesia.ui.OlSettings;

import java.util.Random;

import static arc.Core.*;
import static mindustry.Vars.*;
//Code borrowed from Omaloon

public class Omaloon extends Mod{
    @Override
    public void init(){
        super.init();
        SolarSystem.init();
        LoadedMod mod = mods.locateMod("clesia");
        if(!headless){
            //from Betamindy by sk7725
            Func<String, String> stringf = value -> bundle.get("mod." + value);

            mod.meta.displayName = stringf.get(mod.meta.name + ".name");
            mod.meta.description = bundle.get("mod.clesia.description") +"\n\n"+ bundle.get("mod.clesia.musics");
            mod.meta.author = bundle.get("mod.clesia.author") + "\n\n" + bundle.get("mod.clesia.contributors");
            Random rand = new Random();
            String mogus = String.valueOf(
                    r[rand.nextInt(3)]
            );
            mod.meta.subtitle = "[#7f7f7f]"+"v"+mod.meta.version+"[]" +"\n"+ mogus;
            Events.on(ClientLoadEvent.class, e -> {
                loadSettings();
                ClesiaSettings.init();
                app.post(() -> app.post(() -> {
                    if (!settings.getBool("mod.clesia.show", false)) {
                        new ClesiaDisclaimer().show();
                    }
                }));
            });
            if(!mobile) {
                Events.on(ClientLoadEvent.class, e -> {
                    Table t = new Table();
                    t.margin(4f);
                    t.labelWrap("[#55ff00]" + "Clesia" + "[]" + "[#7f7f7f]" + " v" + mod.meta.version + "[]" + "\n" + mogus);
                    t.pack();
                    scene.add(t.visible(() -> state.isMenu()));
                });
            }
        }
    }

    void loadSettings() {
        ui.settings.addCategory("@mod.clesia.omaloon-settings", "clesia-settings-icon", t -> {
            t.checkPref("mod.clesia.show", false);
            t.checkPref("mod.clesia.check", true);
            t.fill(c -> c.bottom().right().button(Icon.discord, new ImageButton.ImageButtonStyle(), new ClesiaDiscordLink()::show).marginTop(9f).marginLeft(10f).tooltip(bundle.get("setting.clesia.discord-join")).size(84, 45).name("discord"));
        });
    }

    public Clesia(){
        Events.on(FileTreeInitEvent.class, e -> app.post(ClesiaSounds::load));
        Log.info("Loaded Clesia.");
        mods.getMod(getClass());
        Events.on(FileTreeInitEvent.class, e -> Core.app.post(ClesiaShaders::load));
    }

    @Override
    public void loadContent(){
        Log.info("Clesia Loading");
        ClesiaItems.load();
        ClesiaStatusEffects.load();
        ClesiaLiquids.load();
        ClesiaBlocks.load();
        ClesiaPlanets.load();
        ClesiaSounds.load();
        ClesiaTech.load();
        ClesiaStats.load();
        ClesiaFx.load();
        ClesiaUnits.load();
    }
}
