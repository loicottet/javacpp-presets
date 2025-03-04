// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;

        /** \brief ONNXIFI extensions to nGraph backend */
        @Name("ngraph::onnxifi::Backend") @NoOffset @Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class ONNXIFIBackend extends Pointer {
            static { Loader.load(); }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public ONNXIFIBackend(Pointer p) { super(p); }
        
            
            
            

            

            public native @StdString BytePointer get_type();
            public native @SharedPtr Executable compile(@Const @SharedPtr @ByRef Function function);
        }
