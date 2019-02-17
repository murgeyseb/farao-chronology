/**
 * Copyright (c) 2019, RTE (http://www.rte-france.com)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package com.farao_community.farao.commons.chronology;

/**
 * Standard class for all exceptions regarding data chronology management
 * @author Sebastien Murgey {@literal <sebastien.murgey at rte-france.com>}
 */
public class ChronologyException extends RuntimeException {
    /**
     * Constructor with message
     * @param message exception message
     */
    ChronologyException(String message) {
        super(message);
    }

    /**
     * Constructor with message and cause
     * @param message exception message
     * @param cause exception cause
     */
    ChronologyException(String message, Throwable cause) {
        super(message, cause);
    }
}
