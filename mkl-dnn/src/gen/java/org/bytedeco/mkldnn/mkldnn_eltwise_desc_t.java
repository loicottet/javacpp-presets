// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.mkldnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.mkldnn.global.mklml.*;

import static org.bytedeco.mkldnn.global.mkldnn.*;


/** A descriptor of a element-wise operation. */
@Properties(inherit = org.bytedeco.mkldnn.presets.mkldnn.class)
public class mkldnn_eltwise_desc_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public mkldnn_eltwise_desc_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public mkldnn_eltwise_desc_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public mkldnn_eltwise_desc_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public mkldnn_eltwise_desc_t position(long position) {
        return (mkldnn_eltwise_desc_t)super.position(position);
    }

    /** The kind of primitive. Used for self-identifying the primitive
     * descriptor. Must be #mkldnn_eltwise. */
    public native @Cast("mkldnn_primitive_kind_t") int primitive_kind(); public native mkldnn_eltwise_desc_t primitive_kind(int setter);
    /** The kind of propagation. Possible values: #mkldnn_forward_training,
     * #mkldnn_forward_inference, #mkldnn_backward, and #mkldnn_backward_data.
     */
    public native @Cast("mkldnn_prop_kind_t") int prop_kind(); public native mkldnn_eltwise_desc_t prop_kind(int setter);
    /** The kind of eltwise algorithm. Possible values: #mkldnn_eltwise_relu,
     * #mkldnn_eltwise_tanh, #mkldnn_eltwise_elu, #mkldnn_eltwise_square,
     * #mkldnn_eltwise_abs, #mkldnn_eltwise_sqrt, #mkldnn_eltwise_linear,
     * #mkldnn_eltwise_bounded_relu, #mkldnn_eltwise_soft_relu,
     * #mkldnn_eltwise_logistic and #mkldnn_eltwise_exp. */
    public native @Cast("mkldnn_alg_kind_t") int alg_kind(); public native mkldnn_eltwise_desc_t alg_kind(int setter);
    /** Source and destination memory descriptor. */
    public native @ByRef mkldnn_memory_desc_t data_desc(); public native mkldnn_eltwise_desc_t data_desc(mkldnn_memory_desc_t setter);
    /** Source and destination gradient memory descriptor. */
    public native @ByRef mkldnn_memory_desc_t diff_data_desc(); public native mkldnn_eltwise_desc_t diff_data_desc(mkldnn_memory_desc_t setter);
    /** Algorithm specific parameter.
     * Accordance table:
     *  - #mkldnn_eltwise_relu: \p alpha -- negative slope, \p beta ignored
     *  - #mkldnn_eltwise_tanh: \p alpha and \p beta ignored
     *  - #mkldnn_eltwise_elu: \p alpha -- negative slope, \p beta ignored
     *  - #mkldnn_eltwise_square: \p alpha and \p beta ignored
     *  - #mkldnn_eltwise_abs: \p alpha and \p beta ignored
     *  - #mkldnn_eltwise_sqrt: \p alpha and \p beta ignored
     *  - #mkldnn_eltwise_linear: \p alpha -- scale, \p beta -- shift
     *  - #mkldnn_eltwise_bounded_relu: \p alpha -- upper bound, \p beta ignored
     *  - #mkldnn_eltwise_soft_relu: \p alpha and \p beta ignored
     *  - #mkldnn_eltwise_logistic: \p alpha and \p beta ignored
     *  - #mkldnn_eltwise_exp: \p alpha and \p beta ignored
     */
    public native float alpha(); public native mkldnn_eltwise_desc_t alpha(float setter);
    public native float beta(); public native mkldnn_eltwise_desc_t beta(float setter);
}
