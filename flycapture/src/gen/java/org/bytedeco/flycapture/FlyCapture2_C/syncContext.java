// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2_C;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.flycapture.FlyCapture2.*;
import static org.bytedeco.flycapture.global.FlyCapture2.*;

import static org.bytedeco.flycapture.global.FlyCapture2_C.*;


	/**
	 * A context to the MultiSync C library. It must be created before
	 * performing any calls to the library.
	 */
	@Namespace @Name("void") @Opaque @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2_C.class)
public class syncContext extends Pointer {
	    /** Empty constructor. Calls {@code super((Pointer)null)}. */
	    public syncContext() { super((Pointer)null); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public syncContext(Pointer p) { super(p); }
	}
