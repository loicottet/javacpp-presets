// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2_C;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.flycapture.FlyCapture2.*;
import static org.bytedeco.flycapture.global.FlyCapture2.*;

import static org.bytedeco.flycapture.global.FlyCapture2_C.*;


    /** Format 7 information for a single mode. */
    @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2_C.class)
public class fc2GigEImageSettingsInfo extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public fc2GigEImageSettingsInfo() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public fc2GigEImageSettingsInfo(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public fc2GigEImageSettingsInfo(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public fc2GigEImageSettingsInfo position(long position) {
            return (fc2GigEImageSettingsInfo)super.position(position);
        }
    
        /** Maximum image width. */
        public native @Cast("unsigned int") int maxWidth(); public native fc2GigEImageSettingsInfo maxWidth(int setter);
        /** Maximum image height. */
        public native @Cast("unsigned int") int maxHeight(); public native fc2GigEImageSettingsInfo maxHeight(int setter);
        /** Horizontal step size for the offset. */
        public native @Cast("unsigned int") int offsetHStepSize(); public native fc2GigEImageSettingsInfo offsetHStepSize(int setter);
        /** Vertical step size for the offset. */
        public native @Cast("unsigned int") int offsetVStepSize(); public native fc2GigEImageSettingsInfo offsetVStepSize(int setter);
        /** Horizontal step size for the image. */
        public native @Cast("unsigned int") int imageHStepSize(); public native fc2GigEImageSettingsInfo imageHStepSize(int setter);
        /** Vertical step size for the image. */
        public native @Cast("unsigned int") int imageVStepSize(); public native fc2GigEImageSettingsInfo imageVStepSize(int setter);
        /** Supported pixel formats in a bit field. */
        public native @Cast("unsigned int") int pixelFormatBitField(); public native fc2GigEImageSettingsInfo pixelFormatBitField(int setter);
        /** Vendor unique pixel formats in a bit field. */
        public native @Cast("unsigned int") int vendorPixelFormatBitField(); public native fc2GigEImageSettingsInfo vendorPixelFormatBitField(int setter);
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native fc2GigEImageSettingsInfo reserved(int i, int setter);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();
    }
