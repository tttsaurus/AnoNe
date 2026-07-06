package com.cleanroommc.anone.canon;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * It marks that the method is intended to be overridden, not called.
 * It targets potential callers.
 * <p>
 * See {@link OverrideOnly} for the opposite side.
 *
 * @see InvokeOnly
 *
 * @since 1.0.0
 */
@Documented
@Target(ElementType.METHOD)
public @interface OverrideOnly { }
