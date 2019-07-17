/**
 * Copyright 2018 Google Inc. All Rights Reserved.
 */

package android.platform.test.scenario.common.system;

import android.os.RemoteException;
import android.os.SystemClock;
import android.platform.test.option.LongOption;
import android.platform.test.scenario.annotation.Scenario;
import android.support.test.uiautomator.UiDevice;
import androidx.test.InstrumentationRegistry;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Turns the screen on and waits for a specified amount of time.
 */
@Scenario
@RunWith(JUnit4.class)
public class ScreenOn {
    @Rule public LongOption mDurationMs = new LongOption("screenOnDurationMs").setDefault(1000L);

    private UiDevice mDevice;

    @Before
    public void setUp() {
        mDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
    }

    @Test
    public void testScreenOn() throws RemoteException {
        mDevice.wakeUp();
        SystemClock.sleep(mDurationMs.get());
    }
}
