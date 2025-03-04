// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

@Name("google::protobuf::Map<google::protobuf::int32,std::string>") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class IntStringMap extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IntStringMap(Pointer p) { super(p); }
    public IntStringMap()       { allocate();  }
    private native void allocate();
    public native @Name("operator=") @ByRef IntStringMap put(@ByRef IntStringMap x);

    public boolean empty() { return size() == 0; }
    public native long size();

    @Index public native @StdString BytePointer get(@Cast("google::protobuf::int32") int i);
    public native IntStringMap put(@Cast("google::protobuf::int32") int i, BytePointer value);
    @ValueSetter @Index public native IntStringMap put(@Cast("google::protobuf::int32") int i, @StdString String value);

    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator++") @ByRef Iterator increment();
        public native @Name("operator==") boolean equals(@ByRef Iterator it);
        public native @Name("operator*().first") @MemberGetter @Cast("google::protobuf::int32") int first();
        public native @Name("operator*().second") @MemberGetter @StdString BytePointer second();
    }
}

