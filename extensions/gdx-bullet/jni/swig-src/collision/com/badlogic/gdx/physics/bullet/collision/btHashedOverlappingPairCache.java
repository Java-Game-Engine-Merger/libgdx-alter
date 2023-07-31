/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.linearmath.*;

public class btHashedOverlappingPairCache extends btOverlappingPairCache {
	private long swigCPtr;

	protected btHashedOverlappingPairCache (final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.btHashedOverlappingPairCache_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}

	/** Construct a new btHashedOverlappingPairCache, normally you should not need this constructor it's intended for low-level
	 * usage. */
	public btHashedOverlappingPairCache (long cPtr, boolean cMemoryOwn) {
		this("btHashedOverlappingPairCache", cPtr, cMemoryOwn);
		construct();
	}

	@Override
	protected void reset (long cPtr, boolean cMemoryOwn) {
		if (!destroyed) destroy();
		super.reset(CollisionJNI.btHashedOverlappingPairCache_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}

	public static long getCPtr (btHashedOverlappingPairCache obj) {
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
				CollisionJNI.delete_btHashedOverlappingPairCache(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

	public long operatorNew (long sizeInBytes) {
		return CollisionJNI.btHashedOverlappingPairCache_operatorNew__SWIG_0(swigCPtr, this, sizeInBytes);
	}

	public void operatorDelete (long ptr) {
		CollisionJNI.btHashedOverlappingPairCache_operatorDelete__SWIG_0(swigCPtr, this, ptr);
	}

	public long operatorNew (long arg0, long ptr) {
		return CollisionJNI.btHashedOverlappingPairCache_operatorNew__SWIG_1(swigCPtr, this, arg0, ptr);
	}

	public void operatorDelete (long arg0, long arg1) {
		CollisionJNI.btHashedOverlappingPairCache_operatorDelete__SWIG_1(swigCPtr, this, arg0, arg1);
	}

	public long operatorNewArray (long sizeInBytes) {
		return CollisionJNI.btHashedOverlappingPairCache_operatorNewArray__SWIG_0(swigCPtr, this, sizeInBytes);
	}

	public void operatorDeleteArray (long ptr) {
		CollisionJNI.btHashedOverlappingPairCache_operatorDeleteArray__SWIG_0(swigCPtr, this, ptr);
	}

	public long operatorNewArray (long arg0, long ptr) {
		return CollisionJNI.btHashedOverlappingPairCache_operatorNewArray__SWIG_1(swigCPtr, this, arg0, ptr);
	}

	public void operatorDeleteArray (long arg0, long arg1) {
		CollisionJNI.btHashedOverlappingPairCache_operatorDeleteArray__SWIG_1(swigCPtr, this, arg0, arg1);
	}

	public btHashedOverlappingPairCache () {
		this(CollisionJNI.new_btHashedOverlappingPairCache(), true);
	}

	public boolean needsBroadphaseCollision (btBroadphaseProxy proxy0, btBroadphaseProxy proxy1) {
		return CollisionJNI.btHashedOverlappingPairCache_needsBroadphaseCollision(swigCPtr, this, btBroadphaseProxy.getCPtr(proxy0),
			proxy0, btBroadphaseProxy.getCPtr(proxy1), proxy1);
	}

	public btBroadphasePairArray getOverlappingPairArrayConst () {
		return new btBroadphasePairArray(CollisionJNI.btHashedOverlappingPairCache_getOverlappingPairArrayConst(swigCPtr, this),
			false);
	}

	public int GetCount () {
		return CollisionJNI.btHashedOverlappingPairCache_GetCount(swigCPtr, this);
	}

	public btOverlapFilterCallback getOverlapFilterCallback () {
		long cPtr = CollisionJNI.btHashedOverlappingPairCache_getOverlapFilterCallback(swigCPtr, this);
		return (cPtr == 0) ? null : new btOverlapFilterCallback(cPtr, false);
	}

}