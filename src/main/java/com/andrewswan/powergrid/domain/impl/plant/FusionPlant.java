/*
 * Created on 18/12/2007
 */
package com.andrewswan.powergrid.domain.impl.plant;

import com.andrewswan.powergrid.domain.Plant;
import com.andrewswan.powergrid.domain.ResourceMarket.Resource;

/**
 * A fusion-powered {@link Plant}
 */
public class FusionPlant extends AbstractPlant {

  /**
   * Constructor
   *
   * @param minimumPrice
   * @param capacity
   */
  public FusionPlant(final int minimumPrice, final int capacity) {
    super(minimumPrice, 0, PlantType.ECOLOGICAL, capacity);
  }

  @Override
  protected boolean isUsable(final Resource resource) {
    return false;
  }
}
