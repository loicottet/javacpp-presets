// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.flycapture.global.FlyCapture2.*;


	/** Description of the system. */
	@Namespace("FlyCapture2") @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2.class)
public class SystemInfo extends Pointer {
	    static { Loader.load(); }
	    /** Default native constructor. */
	    public SystemInfo() { super((Pointer)null); allocate(); }
	    /** Native array allocator. Access with {@link Pointer#position(long)}. */
	    public SystemInfo(long size) { super((Pointer)null); allocateArray(size); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public SystemInfo(Pointer p) { super(p); }
	    private native void allocate();
	    private native void allocateArray(long size);
	    @Override public SystemInfo position(long position) {
	        return (SystemInfo)super.position(position);
	    }
	
		/** Operating system type as described by OSType. */
		public native @Cast("FlyCapture2::OSType") int osType(); public native SystemInfo osType(int setter);

		/** Detailed description of the operating system. */
		public native @Cast("char") byte osDescription(int i); public native SystemInfo osDescription(int i, byte setter);
		@MemberGetter public native @Cast("char*") BytePointer osDescription();

		/** Byte order of the system. */
		public native @Cast("FlyCapture2::ByteOrder") int byteOrder(); public native SystemInfo byteOrder(int setter);

		/** Amount of memory available on the system. */
		public native @Cast("size_t") long sysMemSize(); public native SystemInfo sysMemSize(long setter);

		/** Detailed description of the CPU. */
		public native @Cast("char") byte cpuDescription(int i); public native SystemInfo cpuDescription(int i, byte setter);
		@MemberGetter public native @Cast("char*") BytePointer cpuDescription();

		/** Number of cores on all CPUs on the system. */
		public native @Cast("size_t") long numCpuCores(); public native SystemInfo numCpuCores(long setter);

		/** List of drivers used. */
		public native @Cast("char") byte driverList(int i); public native SystemInfo driverList(int i, byte setter);
		@MemberGetter public native @Cast("char*") BytePointer driverList();

		/** List of libraries used. */
		public native @Cast("char") byte libraryList(int i); public native SystemInfo libraryList(int i, byte setter);
		@MemberGetter public native @Cast("char*") BytePointer libraryList();

		/** Detailed description of the GPU. */
		public native @Cast("char") byte gpuDescription(int i); public native SystemInfo gpuDescription(int i, byte setter);
		@MemberGetter public native @Cast("char*") BytePointer gpuDescription();

		/** Screen resolution width in pixels. */
		public native @Cast("size_t") long screenWidth(); public native SystemInfo screenWidth(long setter);

		/** Screen resolution height in pixels. */
		public native @Cast("size_t") long screenHeight(); public native SystemInfo screenHeight(long setter);

		/** Reserved for future use. */
		public native @Cast("unsigned int") int reserved(int i); public native SystemInfo reserved(int i, int setter);
		@MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

	}
