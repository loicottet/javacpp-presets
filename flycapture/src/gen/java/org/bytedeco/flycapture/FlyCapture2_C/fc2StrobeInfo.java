// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2_C;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.flycapture.FlyCapture2.*;
import static org.bytedeco.flycapture.global.FlyCapture2.*;

import static org.bytedeco.flycapture.global.FlyCapture2_C.*;


    /** A camera strobe property. */
    @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2_C.class)
public class fc2StrobeInfo extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public fc2StrobeInfo() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public fc2StrobeInfo(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public fc2StrobeInfo(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public fc2StrobeInfo position(long position) {
            return (fc2StrobeInfo)super.position(position);
        }
    
        /** Source value. */
        public native @Cast("unsigned int") int source(); public native fc2StrobeInfo source(int setter);
        /** Presence of strobe. */
        public native @Cast("BOOL") int present(); public native fc2StrobeInfo present(int setter);
        /** Flag indicating if strobe value can be read out. */
        public native @Cast("BOOL") int readOutSupported(); public native fc2StrobeInfo readOutSupported(int setter);
        /** Flag indicating if on/off is supported. */
        public native @Cast("BOOL") int onOffSupported(); public native fc2StrobeInfo onOffSupported(int setter);
        /** Flag indicating if polarity is supported. */
        public native @Cast("BOOL") int polaritySupported(); public native fc2StrobeInfo polaritySupported(int setter);
        /** Minimum value. */
        public native float minValue(); public native fc2StrobeInfo minValue(float setter);
        /** Maximum value. */
        public native float maxValue(); public native fc2StrobeInfo maxValue(float setter);
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native fc2StrobeInfo reserved(int i, int setter);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

    }
