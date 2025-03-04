// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.flycapture.global.FlyCapture2.*;


    /** A camera strobe. */
    @Namespace("FlyCapture2") @NoOffset @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2.class)
public class StrobeControl extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public StrobeControl(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public StrobeControl(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public StrobeControl position(long position) {
            return (StrobeControl)super.position(position);
        }
    
        /** Source value. */
        public native @Cast("unsigned int") int source(); public native StrobeControl source(int setter);
        /** Flag controlling on/off. */
        public native @Cast("bool") boolean onOff(); public native StrobeControl onOff(boolean setter);
        /** Signal polarity. */
        public native @Cast("unsigned int") int polarity(); public native StrobeControl polarity(int setter);
        /** Signal delay (in ms). */
        public native float delay(); public native StrobeControl delay(float setter);
        /** Signal duration (in ms). */
        public native float duration(); public native StrobeControl duration(float setter);
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native StrobeControl reserved(int i, int setter);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

        public StrobeControl() { super((Pointer)null); allocate(); }
        private native void allocate();
    }
