// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2_C;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.flycapture.FlyCapture2.*;
import static org.bytedeco.flycapture.global.FlyCapture2.*;

import static org.bytedeco.flycapture.global.FlyCapture2_C.*;


    /** Camera diagnostic information. */
    @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2_C.class)
public class fc2CameraStats extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public fc2CameraStats() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public fc2CameraStats(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public fc2CameraStats(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public fc2CameraStats position(long position) {
            return (fc2CameraStats)super.position(position);
        }
    
        /* Number of dropped images in DROP_IMAGE mode */
        public native @Cast("unsigned int") int imageDropped(); public native fc2CameraStats imageDropped(int setter);
        /* Number of corrupt images, such as missing packet, zero packet */
        public native @Cast("unsigned int") int imageCorrupt(); public native fc2CameraStats imageCorrupt(int setter);
        /* Number of transmissions failed of camera */
        public native @Cast("unsigned int") int imageXmitFailed(); public native fc2CameraStats imageXmitFailed(int setter);
        /* Number of images dropped in driver */
        public native @Cast("unsigned int") int imageDriverDropped(); public native fc2CameraStats imageDriverDropped(int setter);
        /* Errors of register reading */
        public native @Cast("unsigned int") int regReadFailed(); public native fc2CameraStats regReadFailed(int setter);
        /* Errors of register writing */
        public native @Cast("unsigned int") int regWriteFailed(); public native fc2CameraStats regWriteFailed(int setter);
        /* Port errors */
        public native @Cast("unsigned int") int portErrors(); public native fc2CameraStats portErrors(int setter);

        /* The value of the camera power register.
         * false: Camera is powered down.
         * true: Camera is powered up.
         */
        public native @Cast("BOOL") int cameraPowerUp(); public native fc2CameraStats cameraPowerUp(int setter);

        /* The voltage values of the various voltage registers
         * supported by the camera.
         */
        public native float cameraVoltages(int i); public native fc2CameraStats cameraVoltages(int i, float setter);
        @MemberGetter public native FloatPointer cameraVoltages();

        /** The number of voltage registers available.
         * 0: the values in cameraVoltages[] are invalid.
         */
        public native @Cast("unsigned int") int numVoltages(); public native fc2CameraStats numVoltages(int setter);

        /* The current values of the various current registers
         * supported by the camera.
         */
        public native float cameraCurrents(int i); public native fc2CameraStats cameraCurrents(int i, float setter);
        @MemberGetter public native FloatPointer cameraCurrents();

        /** The number of current registers available.
         * 0: the values in cameraCurrents[] are invalid.
         */
        public native @Cast("unsigned int") int numCurrents(); public native fc2CameraStats numCurrents(int setter);

        /* The temperature of the camera board-level components. The value is
         * in kelvins (0�C = 273.15K) and are in one-tenths (0.1) of a kelvin.
         */
        public native @Cast("unsigned int") int temperature(); public native fc2CameraStats temperature(int setter);

        /* Time in seconds since the camera was initialized. */
        public native @Cast("unsigned int") int timeSinceInitialization(); public native fc2CameraStats timeSinceInitialization(int setter);
        /* Time in seconds since the camera detected a bus reset. */
        public native @Cast("unsigned int") int timeSinceBusReset(); public native fc2CameraStats timeSinceBusReset(int setter);
        /* Time stamp */
        public native @ByRef fc2TimeStamp timeStamp(); public native fc2CameraStats timeStamp(fc2TimeStamp setter);
        /* Number of packets requested for resend */
        public native @Cast("unsigned int") int numResendPacketsRequested(); public native fc2CameraStats numResendPacketsRequested(int setter);
        /* Number of packet-resend packets received */
        public native @Cast("unsigned int") int numResendPacketsReceived(); public native fc2CameraStats numResendPacketsReceived(int setter);
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native fc2CameraStats reserved(int i, int setter);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

    }
