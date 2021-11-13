package features.scenes;

import features.TestData;
import ro.altom.altunitytester.AltUnityDriver;
import ro.altom.altunitytester.AltUnityObject;
import ro.altom.altunitytester.Commands.FindObject.AltFindObjectsParameters;
import ro.altom.altunitytester.Commands.UnityCommand.AltLoadSceneParameters;

public class MainScene {

    /**
     * The "Run!" `button`.
     */
    public static AltUnityObject btnRun()
    {
        AltFindObjectsParameters params = new AltFindObjectsParameters
                .Builder(AltUnityDriver.By.NAME, "StartButton")
                .build();
        return TestData.altUnityDriver.findObject(params);
    }

    /**
     * The "||" (Pause) `button`.
     */
    public static AltUnityObject btnPause()
    {
        AltFindObjectsParameters params = new AltFindObjectsParameters
                .Builder(AltUnityDriver.By.NAME, "pauseButton")
                .build();
        return TestData.altUnityDriver.findObject(params);
    }

    /**
     * Opens `this` scene.
     */
    public static void Open()
    {
        AltLoadSceneParameters params = new AltLoadSceneParameters
                .Builder("Main")
                .build();
        TestData.altUnityDriver.loadScene(params);
    }

    /**
     * Start a 10 second run, then pauses.
     */
    public static void StartRunThenPause() throws InterruptedException {
        Thread.sleep(2000);
        btnRun().tap();
        Thread.sleep(10000);
        btnPause().tap();
    }
}
