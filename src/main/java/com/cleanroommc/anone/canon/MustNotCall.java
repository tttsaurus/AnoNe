package com.cleanroommc.anone.canon;

import java.lang.annotation.*;

/**
 * It specifies which callers are forbidden from calling the annotated method.
 * <p>
 * With the default parameters, this annotation applies to all the overriders of
 * the annotated method, including all the inheritance hierarchies.
 *
 * @see MustCall
 *
 * @since 1.0.0
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
public @interface MustNotCall {

    /**
     * Forbidden call position.
     *
     * @see CallPosition
     */
    CallPosition position() default CallPosition.UNRESTRICTED;

    /**
     * Scope in which this contract is enforced.
     *
     * @see #scopeRoot()
     * @see CallScope
     */
    CallScope scope() default CallScope.OVERRIDERS;

    /**
     * It specifies where to start counting overriders.
     * <p>
     * It only applies when {@link #scope()} is set to {@link CallScope#OVERRIDERS},
     * which is the default value. This option can be ignored when {@link #scope()}
     * is set to {@link CallScope#GLOBAL}.
     *
     * @see #scope()
     * @see Super
     */
    Class<?>[] scopeRoot() default { Super.class };
}
