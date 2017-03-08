package com.google.android.cameraview.face;

import com.google.android.gms.vision.MultiProcessor;
import com.google.android.gms.vision.Tracker;
import com.google.android.gms.vision.face.Face;

/**
 * Created by joro on 07.03.17.
 */

public class GraphicFaceTrackerFactory implements MultiProcessor.Factory<Face> {
    @Override
    public Tracker<Face> create(Face face) {
        return new GraphicFaceTracker();
    }
}
