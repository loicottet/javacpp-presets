// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.leptonica;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.leptonica.global.lept.*;


/**
 * \file ptra.h
 *
 * <pre>
 *  Contains the following structs:
 *      struct L_Ptra
 *      struct L_Ptraa
 *
 *  Contains definitions for:
 *      L_Ptra compaction flags for removal
 *      L_Ptra shifting flags for insert
 *      L_Ptraa accessor flags
 * </pre>
 */


/*------------------------------------------------------------------------*
 *                     Generic Ptr Array Structs                          *
 *------------------------------------------------------------------------*/

    /** Generic pointer array */
@Name("L_Ptra") @Properties(inherit = org.bytedeco.leptonica.presets.lept.class)
public class L_PTRA extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public L_PTRA() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public L_PTRA(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public L_PTRA(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public L_PTRA position(long position) {
        return (L_PTRA)super.position(position);
    }

    /** size of allocated ptr array         */
    public native @Cast("l_int32") int nalloc(); public native L_PTRA nalloc(int setter);
    /** greatest valid index                */
    public native @Cast("l_int32") int imax(); public native L_PTRA imax(int setter);
    /** actual number of stored elements    */
    public native @Cast("l_int32") int nactual(); public native L_PTRA nactual(int setter);
    /** ptr array                           */
    public native Pointer array(int i); public native L_PTRA array(int i, Pointer setter);
    public native @Cast("void**") PointerPointer array(); public native L_PTRA array(PointerPointer setter);
}
