// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.leptonica;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.leptonica.global.lept.*;


/** Array of FPix */
@Name("FPixa") @Properties(inherit = org.bytedeco.leptonica.presets.lept.class)
public class FPIXA extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public FPIXA() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FPIXA(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FPIXA(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public FPIXA position(long position) {
        return (FPIXA)super.position(position);
    }

    /** number of fpix in ptr array       */
    public native @Cast("l_int32") int n(); public native FPIXA n(int setter);
    /** number of fpix ptrs allocated     */
    public native @Cast("l_int32") int nalloc(); public native FPIXA nalloc(int setter);
    /** reference count (1 if no clones)  */
    public native @Cast("l_uint32") int refcount(); public native FPIXA refcount(int setter);
    /** the array of ptrs to fpix         */
    public native FPIX fpix(int i); public native FPIXA fpix(int i, FPIX setter);
    public native @Cast("FPix**") PointerPointer fpix(); public native FPIXA fpix(PointerPointer setter);
}
