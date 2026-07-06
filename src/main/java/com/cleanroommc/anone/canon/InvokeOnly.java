package com.cleanroommc.anone.canon;

import java.lang.annotation.*;

/**
 * It marks that the method is intended to be invoked, not overridden.
 * It targets potential overriders.
 * <p>
 * See {@link InvokeOnly} for the opposite side.
 *
 * @see OverrideOnly
 *
 * @since 1.0.0
 */
@Documented
@Target(ElementType.METHOD)
public @interface InvokeOnly { }
