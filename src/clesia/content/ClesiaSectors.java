package clesia.content;

import mindustry.type.*;
import mindustry.ctype.*;
import clesia.content.*;

public class ClesiaSectors {
	public static SectorPreset
		launchSecurePoint, wrangledForest, farlandHeights, crossways, witheredRiver, coulee, taintedNexus, ravengedAxis, vacantQuadrant, desertFlats, coldCrater, dreadCliff, stranded, storageComplex, visionary

	public void load(){
		launchSecurePoint = new SectorPreset("launchSecurePoint", ClesiaPlanets.clesia, 0) {{
			alwaysUnlocked = true;
			addStartingItems = true;
			captureWave = 10;
			difficulty = 1;
      overrideLaunchDefaults = true;
      noLighting = true;
			startWaveTimeMultiplier = 3f;
		}};
		brokenOutpost = new SectorPreset("brokenOutpost", ClesiaPlanets.clesia, 35) {{
			captureWave = 15;
			difficulty = 2;
			startWaveTimeMultiplier = 2f;
		}};

		// lamoni
		freshBeggining = new SectorPreset("FreshBeggining", ClesiaPlanets.clesia, 0) {{
			alwaysUnlocked = true;
			captureWave = 10;
			difficulty = 1;
			startWaveTimeMultiplier = 2f;
		}};
		reactiveMonolith = new SectorPreset("ReactiveMonolith", ClesiaPlanets.clesia, 54) {{
			captureWave = 20;
			difficulty = 1;
			startWaveTimeMultiplier = 2f;
		}};
		sodaicOutpost = new SectorPreset("SodaicOutpost", ClesiaPlanets.clesia, 34) {{
			difficulty = 3;
		}};
	}
}
