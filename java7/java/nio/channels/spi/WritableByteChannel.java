package java.nio.channels;

public interface WritableByteChannel extends Channel {
	// FIXME - needs to model the buffer of content
	
	//@ public behavior
	//       OPENJML - the buffer of content is changed
	//@   assignable b.position;
	//@   ensures \result >= 0;
	//@   ensures b.position == \old(b.position) + \result;
    public abstract int write(java.nio.ByteBuffer b) throws java.io.IOException;
}