// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;

        /** \brief ONNXIFI backend manager */
        @Namespace("ngraph::onnxifi") @NoOffset @Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class BackendManager extends Pointer {
            static { Loader.load(); }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public BackendManager(Pointer p) { super(p); }
        
            
            

            
            

            public static native void get_backend_ids(onnxBackendID backend_ids, @Cast("std::size_t*") SizeTPointer count);

            

            
        }
