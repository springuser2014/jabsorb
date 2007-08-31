/*
 * Simple Java Dict Client (RFC2229)
 *
 * $Id: Strategy.java,v 1.1.2.1 2006/03/06 12:39:21 mclark Exp $
 *
 * Copyright Metaparadigm Pte. Ltd. 2004.
 * Michael Clark <michael@metaparadigm.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.metaparadigm.dict;

public class Strategy
{
    private String strategy;
    private String description;

    public String getStrategy() { return strategy; }
    public String getDescription() { return description; }

    public Strategy(String strategy, String description)
    {
	this.strategy = strategy;
	this.description = description;
    }

    public String toString()
    {
	return "strategy: " + strategy + " \"" + description + "\"";
    }

}