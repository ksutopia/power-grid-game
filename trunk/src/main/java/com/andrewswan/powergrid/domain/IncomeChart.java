/*
 * Created on 07/02/2008
 */
package com.andrewswan.powergrid.domain;

/**
 * The chart that indicates how much income is generated by powering a given
 * number of cities
 */
public interface IncomeChart {

  /**
   * Returns the amount of income that would be earned by powering the given
   * number of cities
   * 
   * @param cities must be zero or more
   * @return see above
   */
  int getIncome(int cities);
  
  /**
   * Returns the incomes for all numbers of cities
   * 
   * @return an array indexed by the number of cities; any greater number of
   *   cities earns the amount in the last position of the given array
   */
  int[] getAllIncomes();
}