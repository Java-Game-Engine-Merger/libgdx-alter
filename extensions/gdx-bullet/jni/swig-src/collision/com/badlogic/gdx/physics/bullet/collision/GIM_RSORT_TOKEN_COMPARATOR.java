/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;

public class GIM_RSORT_TOKEN_COMPARATOR extends BulletBase {
	private long swigCPtr;

	protected GIM_RSORT_TOKEN_COMPARATOR (final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}

	/** Construct a new GIM_RSORT_TOKEN_COMPARATOR, normally you should not need this constructor it's intended for low-level
	 * usage. */
	public GIM_RSORT_TOKEN_COMPARATOR (long cPtr, boolean cMemoryOwn) {
		this("GIM_RSORT_TOKEN_COMPARATOR", cPtr, cMemoryOwn);
		construct();
	}

	@Override
	protected void reset (long cPtr, boolean cMemoryOwn) {
		if (!destroyed) destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}

	public static long getCPtr (GIM_RSORT_TOKEN_COMPARATOR obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize () throws Throwable {
		if (!destroyed) destroy();
		super.finalize();
	}

	@Override
	protected synchronized void delete () {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CollisionJNI.delete_GIM_RSORT_TOKEN_COMPARATOR(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

	public int operatorFunctionCall (GIM_RSORT_TOKEN a, GIM_RSORT_TOKEN b) {
		return CollisionJNI.GIM_RSORT_TOKEN_COMPARATOR_operatorFunctionCall(swigCPtr, this, GIM_RSORT_TOKEN.getCPtr(a), a,
			GIM_RSORT_TOKEN.getCPtr(b), b);
	}

	public GIM_RSORT_TOKEN_COMPARATOR () {
		this(CollisionJNI.new_GIM_RSORT_TOKEN_COMPARATOR(), true);
	}

}