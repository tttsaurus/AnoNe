package com.cleanroommc.anone.canon;

/**
 * @see MustCallIt
 * @see MustNotCallIt
 *
 * @since 1.0.0
 */
public enum CallPosition {

    /**
     * The target call must be the first executable statement.
     */
    HEAD,

    /**
     * The target call must be the last executable statement.
     */
    TAIL,

    /**
     * The target call may appear anywhere.
     */
    UNRESTRICTED,
}
