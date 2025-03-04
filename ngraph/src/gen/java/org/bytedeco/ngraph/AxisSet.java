// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;

    /** \brief A set of axes. */
    @Namespace("ngraph") @Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class AxisSet extends SizeTSet {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public AxisSet(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public AxisSet(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public AxisSet position(long position) {
            return (AxisSet)super.position(position);
        }
    
        public AxisSet() { super((Pointer)null); allocate(); }
        private native void allocate();

        public AxisSet(@Const @ByRef SizeTSet axes) { super((Pointer)null); allocate(axes); }
        private native void allocate(@Const @ByRef SizeTSet axes);

        public AxisSet(@Const @ByRef SizeTVector axes) { super((Pointer)null); allocate(axes); }
        private native void allocate(@Const @ByRef SizeTVector axes);

        public AxisSet(@Const @ByRef AxisSet axes) { super((Pointer)null); allocate(axes); }
        private native void allocate(@Const @ByRef AxisSet axes);

        public native @ByRef @Name("operator =") AxisSet put(@Const @ByRef AxisSet v);

        public native @Cast("int64_t*") @StdVector SizeTPointer to_vector();
    }
