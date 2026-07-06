package com.cleanroommc.anone.canon;

/**
 * @see MustCall
 * @see MustNotCall
 *
 * @since 1.0.0
 */
public enum CallScope {

    /**
     * Applies to every invocation.
     */
    GLOBAL,

    /**
     * Applies only to overriding implementations, including all the inheritance hierarchies.
     */
    OVERRIDERS
}
