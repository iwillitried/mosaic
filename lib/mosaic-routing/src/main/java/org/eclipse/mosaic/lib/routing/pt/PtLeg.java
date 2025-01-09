/*
 * Copyright (c) 2024 Fraunhofer FOKUS and others. All rights reserved.
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contact: mosaic@fokus.fraunhofer.de
 */

package org.eclipse.mosaic.lib.routing.pt;

import org.eclipse.mosaic.lib.geo.GeoPoint;

import java.util.ArrayList;
import java.util.List;

/**
 * A public transport leg contains all pt stops of the route.
 */
public class PtLeg {

    /**
     * Each public transport stop consists of its geo-location and the planned arrival and departure time at this stop.
     *
     * @param location The geographic location of the stop.
     * @param arrivalTime The time when arriving at this stop. {@code null} for the first stop of the leg.
     * @param departureTime The time when leaving this stop. {@code null} for the last stop of the leg.
     */
    public record PtStop(GeoPoint location, Long arrivalTime, Long departureTime) {}

    private final List<PtStop> stops = new ArrayList<>();

    public PtLeg(List<PtStop> stops) {
        this.stops.addAll(stops);
    }

    /**
     * Returns the list of stops along the public transport route.
     */
    public List<PtStop> getStops() {
        return stops;
    }

}
