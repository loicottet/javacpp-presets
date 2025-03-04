// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.flycapture.global.FlyCapture2.*;


    /** Format 7 packet information. */
    @Namespace("FlyCapture2") @NoOffset @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2.class)
public class Format7PacketInfo extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Format7PacketInfo(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public Format7PacketInfo(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public Format7PacketInfo position(long position) {
            return (Format7PacketInfo)super.position(position);
        }
    
        /** Recommended bytes per packet. */
        public native @Cast("unsigned int") int recommendedBytesPerPacket(); public native Format7PacketInfo recommendedBytesPerPacket(int setter);
        /** Maximum bytes per packet. */
        public native @Cast("unsigned int") int maxBytesPerPacket(); public native Format7PacketInfo maxBytesPerPacket(int setter);
        /** Minimum bytes per packet. */
        public native @Cast("unsigned int") int unitBytesPerPacket(); public native Format7PacketInfo unitBytesPerPacket(int setter);
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native Format7PacketInfo reserved(int i, int setter);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

        public Format7PacketInfo() { super((Pointer)null); allocate(); }
        private native void allocate();
    }
