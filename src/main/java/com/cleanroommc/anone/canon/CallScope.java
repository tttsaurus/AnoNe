package com.cleanroommc.anone.canon;

/**
 * @see MustCallIt
 * @see MustNotCallIt
 *
 * @since 1.0.0
 */
public enum CallScope {

    /**
     * Applies to overriding implementations, including only the direct inheritance.
     */
    DIRECT_OVERRIDERS,

    /**
     * Applies to overriding implementations, including all the inheritance hierarchies.
     */
    TRANSITIVE_OVERRIDERS,
}
