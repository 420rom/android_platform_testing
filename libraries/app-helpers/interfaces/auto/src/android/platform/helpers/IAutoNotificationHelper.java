/*
 * Copyright (C) 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.platform.helpers;

public interface IAutoNotificationHelper extends INotificationHelper {
    /**
     * Setup expectations: None.
     *
     * <p>Scroll up from the bottom of the scrollable region to top in <code>durationMs</code>
     * milliseconds only if notification app is currently open.
     */
    public void scrollUpOnePage(long durationMs);

    /**
     * Setup expectations: None.
     *
     * <p>Scroll up from the bottom of the scrollable region towards top by <code>percent</code>
     * percent of the whole scrollable region in <code>durationMs</code> milliseconds only if
     * notification app is currently open.
     */
    public void scrollUp(float percent, long durationMs);

    /**
     * Setup expectations: None.
     *
     * <p>Scroll down from the top of the scrollable region to bottom in <code>durationMs</code>
     * seconds only if notification app is currently open.
     */
    public void scrollDownOnePage(long durationMs);

    /**
     * Setup expectations: None.
     *
     * <p>Scroll down from the top of the scrollable region towards bottom by <code>percent</code>
     * percent of the whole scrollable region in <code>durationMs</code> milliseconds only if
     * notification app is currently open.
     */
    public void scrollDown(float percent, long durationMs);
}
