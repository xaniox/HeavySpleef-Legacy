/*
 * HeavySpleef - Advanced spleef plugin for bukkit
 *
 * Copyright (C) 2013-2014 matzefratze123
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.matzefratze123.heavyspleef.stats;

import java.util.List;

import de.matzefratze123.api.hs.sql.AbstractDatabase;
import de.matzefratze123.heavyspleef.stats.SQLStatisticDatabase.ExceptionHandler;

public interface IStatisticDatabase {

	public AbstractDatabase getRawDatabase();

	public void saveAccountsAsync(ExceptionHandler handler);

	public void saveAccountsAsync();

	public void saveAccounts() throws AccountException;

	public StatisticModule loadAccount(String holder) throws AccountException;

	public List<StatisticModule> loadAccounts() throws AccountException;

}
