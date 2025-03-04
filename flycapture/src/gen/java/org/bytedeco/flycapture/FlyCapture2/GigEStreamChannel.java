// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.flycapture.global.FlyCapture2.*;


    /** Information about a single GigE stream channel. */
    @Namespace("FlyCapture2") @NoOffset @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2.class)
public class GigEStreamChannel extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public GigEStreamChannel(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public GigEStreamChannel(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public GigEStreamChannel position(long position) {
            return (GigEStreamChannel)super.position(position);
        }
    
        /** Network interface index used (or to use). */
        public native @Cast("unsigned int") int networkInterfaceIndex(); public native GigEStreamChannel networkInterfaceIndex(int setter);
        /** Host port on the PC where the camera will send the data stream. */
        public native @Cast("unsigned int") int hostPort(); public native GigEStreamChannel hostPort(int setter);
        /** Disable IP fragmentation of packets. */
        public native @Cast("bool") boolean doNotFragment(); public native GigEStreamChannel doNotFragment(boolean setter);
        /** Packet size, in bytes. */
        public native @Cast("unsigned int") int packetSize(); public native GigEStreamChannel packetSize(int setter);
        /** Inter packet delay, in timestamp counter units. */
        public native @Cast("unsigned int") int interPacketDelay(); public native GigEStreamChannel interPacketDelay(int setter);
        /** Destination IP address. It can be a multicast or unicast address. */
        public native @ByRef IPAddress destinationIpAddress(); public native GigEStreamChannel destinationIpAddress(IPAddress setter);
        /** Source UDP port of the stream channel. Read only. */
        public native @Cast("unsigned int") int sourcePort(); public native GigEStreamChannel sourcePort(int setter);

        public GigEStreamChannel() { super((Pointer)null); allocate(); }
        private native void allocate();
    }
