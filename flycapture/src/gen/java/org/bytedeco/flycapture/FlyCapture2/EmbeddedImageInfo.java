// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.flycapture.global.FlyCapture2.*;


    /** Properties of the possible embedded image information. */
    @Namespace("FlyCapture2") @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2.class)
public class EmbeddedImageInfo extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public EmbeddedImageInfo() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public EmbeddedImageInfo(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public EmbeddedImageInfo(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public EmbeddedImageInfo position(long position) {
            return (EmbeddedImageInfo)super.position(position);
        }
    
        public native @ByRef EmbeddedImageInfoProperty timestamp(); public native EmbeddedImageInfo timestamp(EmbeddedImageInfoProperty setter);
        public native @ByRef EmbeddedImageInfoProperty gain(); public native EmbeddedImageInfo gain(EmbeddedImageInfoProperty setter);
        public native @ByRef EmbeddedImageInfoProperty shutter(); public native EmbeddedImageInfo shutter(EmbeddedImageInfoProperty setter);
        public native @ByRef EmbeddedImageInfoProperty brightness(); public native EmbeddedImageInfo brightness(EmbeddedImageInfoProperty setter);
        public native @ByRef EmbeddedImageInfoProperty exposure(); public native EmbeddedImageInfo exposure(EmbeddedImageInfoProperty setter);
        public native @ByRef EmbeddedImageInfoProperty whiteBalance(); public native EmbeddedImageInfo whiteBalance(EmbeddedImageInfoProperty setter);
        public native @ByRef EmbeddedImageInfoProperty frameCounter(); public native EmbeddedImageInfo frameCounter(EmbeddedImageInfoProperty setter);
        public native @ByRef EmbeddedImageInfoProperty strobePattern(); public native EmbeddedImageInfo strobePattern(EmbeddedImageInfoProperty setter);
        public native @ByRef EmbeddedImageInfoProperty GPIOPinState(); public native EmbeddedImageInfo GPIOPinState(EmbeddedImageInfoProperty setter);
        public native @ByRef EmbeddedImageInfoProperty ROIPosition(); public native EmbeddedImageInfo ROIPosition(EmbeddedImageInfoProperty setter);
    }
