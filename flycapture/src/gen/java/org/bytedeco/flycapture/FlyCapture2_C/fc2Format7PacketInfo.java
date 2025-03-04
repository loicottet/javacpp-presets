// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2_C;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.flycapture.FlyCapture2.*;
import static org.bytedeco.flycapture.global.FlyCapture2.*;

import static org.bytedeco.flycapture.global.FlyCapture2_C.*;


    /** Format 7 packet information. */
    @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2_C.class)
public class fc2Format7PacketInfo extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public fc2Format7PacketInfo() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public fc2Format7PacketInfo(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public fc2Format7PacketInfo(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public fc2Format7PacketInfo position(long position) {
            return (fc2Format7PacketInfo)super.position(position);
        }
    
        /** Recommended bytes per packet. */
        public native @Cast("unsigned int") int recommendedBytesPerPacket(); public native fc2Format7PacketInfo recommendedBytesPerPacket(int setter);
        /** Maximum bytes per packet. */
        public native @Cast("unsigned int") int maxBytesPerPacket(); public native fc2Format7PacketInfo maxBytesPerPacket(int setter);
        /** Minimum bytes per packet. */
        public native @Cast("unsigned int") int unitBytesPerPacket(); public native fc2Format7PacketInfo unitBytesPerPacket(int setter);
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native fc2Format7PacketInfo reserved(int i, int setter);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

    }
