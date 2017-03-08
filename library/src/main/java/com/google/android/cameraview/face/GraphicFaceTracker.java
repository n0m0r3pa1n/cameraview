package com.google.android.cameraview.face;

/**
 * Created by joro on 07.03.17.
 */

import android.util.Log;

import com.google.android.gms.vision.Tracker;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.FaceDetector;

/**
 * Face tracker for each detected individual. This maintains a face graphic within the app's
 * associated face overlay.
 */
class GraphicFaceTracker extends Tracker<Face> {
    public static final String TAG = GraphicFaceTracker.class.getSimpleName();

    GraphicFaceTracker() {
    }

    /**
     * Start tracking the detected face instance within the face overlay.
     */
    @Override
    public void onNewItem(int faceId, Face item) {
        // TODO: Add face detection callback
        Log.d(TAG, "onNewItem: ");
    }

    /**
     * Update the position/characteristics of the face within the overlay.
     */
    @Override
    public void onUpdate(FaceDetector.Detections<Face> detectionResults, Face face) {
        Log.d(TAG, "onUpdate: ");
    }

    /**
     * Hide the graphic when the corresponding face was not detected.  This can happen for
     * intermediate frames temporarily (e.g., if the face was momentarily blocked from
     * view).
     */
    @Override
    public void onMissing(FaceDetector.Detections<Face> detectionResults) {
        Log.d(TAG, "onMissing: ");
    }

    /**
     * Called when the face is assumed to be gone for good. Remove the graphic annotation from
     * the overlay.
     */
    @Override
    public void onDone() {
        Log.d(TAG, "onDone: ");
    }
}
