// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// #if GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
// #endif  // GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER

@Namespace("google::protobuf::internal") @Opaque @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class RepeatedPtrFieldBase extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public RepeatedPtrFieldBase() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RepeatedPtrFieldBase(Pointer p) { super(p); }
}
