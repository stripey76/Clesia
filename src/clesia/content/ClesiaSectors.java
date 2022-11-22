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
		wrangledForest = new SectorPreset("wrangledForest", ClesiaPlanets.clesia, 1) {{
			captureWave = 12;
			difficulty = 2;
		}};
		farlandHeights = new SectorPreset("farlandHeights", ClesiaPlanets.clesia, 2) {{
			difficulty = 3;
		}};
		crossways = new SectorPreset("crossways", ClesiaPlanets.clesia, 3) {{
			captureWave = 20;
			difficulty = 3;
			startWaveTimeMultiplier = 3f;
		}};
		witheredRiver = new SectorPreset("witheredRiver", ClesiaPlanets.clesia, 4) {{
			difficulty = 3;
                        captureWave = 17;
		}};
                coulee = new SectorPreset("coulee", ClesiaPlanets.clesia, 5) {{
			difficulty = 7;
                        captureWave = 30;
		}};
                taintedNexus = new SectorPreset("taintedNexus", ClesiaPlanets.clesia, 12) {{
			difficulty = 5;
                        captureWave = 8;
		}};
                ravengedAxis = new SectorPreset("ravengedAxis", ClesiaPlanets.clesia, 15) {{
			difficulty = 12;
		}};
                vacantQuadrant = new SectorPreset("vacantQuadrant", ClesiaPlanets.clesia, 35) {{
			difficulty = 15;
                        captureWave = 45;
		}};
                desertFlats = new SectorPreset("desertFlats", ClesiaPlanets.clesia, 74) {{
			difficulty = 12;
		}};
                coldCrater = new SectorPreset("coldCrater", ClesiaPlanets.clesia, 45) {{
			difficulty = 15;
                        captureWave = 20;
		}};
                dreadCliff = new SectorPreset("dreadCliff", ClesiaPlanets.clesia, 46) {{
			difficulty = 17;
		}};
                stranded = new SectorPreset("stranded", ClesiaPlanets.clesia, 50) {{
			difficulty = 18;
                        captureWave = 40;
		}};
                storageComplex = new SectorPreset("storageComplex", ClesiaPlanets.clesia, 51) {{
			difficulty = 20;
                        captureWave = 80;
		}};
                visionary = new SectorPreset("visionary", ClesiaPlanets.clesia, 79) {{
			difficulty = 30;
		}};
	}
}
