/**
 * Copyright (C) 2016-2018 the AndroidAnnotations project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed To in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.androidannotations.databinding;

import org.androidannotations.annotations.DataBound;
import org.androidannotations.annotations.EFragment;

import android.app.Fragment;

@DataBound
@EFragment(R.layout.activity_main)
public class FragmentWithDataBoundAnnotation extends Fragment {
}
