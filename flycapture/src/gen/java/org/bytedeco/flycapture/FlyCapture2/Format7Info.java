// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.flycapture.global.FlyCapture2.*;


    /** Format 7 information for a single mode. */
    @Namespace("FlyCapture2") @NoOffset @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2.class)
public class Format7Info extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Format7Info(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public Format7Info(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public Format7Info position(long position) {
            return (Format7Info)super.position(position);
        }
    
        /** Format 7 mode. */
        public native @Cast("FlyCapture2::Mode") int mode(); public native Format7Info mode(int setter);

        /** Maximum image width. */
        public native @Cast("unsigned int") int maxWidth(); public native Format7Info maxWidth(int setter);
        /** Maximum image height. */
        public native @Cast("unsigned int") int maxHeight(); public native Format7Info maxHeight(int setter);
        /** Horizontal step size for the offset. */
        public native @Cast("unsigned int") int offsetHStepSize(); public native Format7Info offsetHStepSize(int setter);
        /** Vertical step size for the offset. */
        public native @Cast("unsigned int") int offsetVStepSize(); public native Format7Info offsetVStepSize(int setter);
        /** Horizontal step size for the image. */
        public native @Cast("unsigned int") int imageHStepSize(); public native Format7Info imageHStepSize(int setter);
        /** Vertical step size for the image. */
        public native @Cast("unsigned int") int imageVStepSize(); public native Format7Info imageVStepSize(int setter);
        /** Supported pixel formats in a bit field. */
        public native @Cast("unsigned int") int pixelFormatBitField(); public native Format7Info pixelFormatBitField(int setter);
        /** Vendor unique pixel formats in a bit field. */
        public native @Cast("unsigned int") int vendorPixelFormatBitField(); public native Format7Info vendorPixelFormatBitField(int setter);

        /** Current packet size in bytes. */
        public native @Cast("unsigned int") int packetSize(); public native Format7Info packetSize(int setter);
        /** Minimum packet size in bytes for current mode. */
        public native @Cast("unsigned int") int minPacketSize(); public native Format7Info minPacketSize(int setter);
        /** Maximum packet size in bytes for current mode. */
        public native @Cast("unsigned int") int maxPacketSize(); public native Format7Info maxPacketSize(int setter);
        /** Current packet size as a percentage of maximum packet size. */
        public native float percentage(); public native Format7Info percentage(float setter);
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native Format7Info reserved(int i, int setter);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

        public Format7Info() { super((Pointer)null); allocate(); }
        private native void allocate();
    }
