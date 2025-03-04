// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.leptonica;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.leptonica.global.lept.*;


    /** Number array: an array of floats */
@Name("Numa") @Properties(inherit = org.bytedeco.leptonica.presets.lept.class)
public class NUMA extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NUMA() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NUMA(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NUMA(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NUMA position(long position) {
        return (NUMA)super.position(position);
    }

    /** size of allocated number array      */
    public native @Cast("l_int32") int nalloc(); public native NUMA nalloc(int setter);
    /** number of numbers saved             */
    public native @Cast("l_int32") int n(); public native NUMA n(int setter);
    /** reference count (1 if no clones)    */
    public native @Cast("l_int32") int refcount(); public native NUMA refcount(int setter);
    /** x value assigned to array[0]        */
    public native @Cast("l_float32") float startx(); public native NUMA startx(float setter);
    /** change in x value as i --> i + 1    */
    public native @Cast("l_float32") float delx(); public native NUMA delx(float setter);
    /** number array                        */
    public native @Cast("l_float32*") FloatPointer array(); public native NUMA array(FloatPointer setter);
}
