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
package de.matzefratze123.heavyspleef.command;

import static de.matzefratze123.heavyspleef.util.I18N._;

import org.bukkit.command.CommandSender;

import de.matzefratze123.api.hs.command.Command;
import de.matzefratze123.api.hs.command.CommandHelp;
import de.matzefratze123.api.hs.command.CommandListener;
import de.matzefratze123.api.hs.command.CommandPermissions;
import de.matzefratze123.heavyspleef.core.Game;
import de.matzefratze123.heavyspleef.util.Permissions;

public class CommandRegenerate implements CommandListener {

	@Command(value = "regenerate", minArgs = 1)
	@CommandPermissions(value = { Permissions.RESTORE_FLOORS })
	@CommandHelp(usage = "/spleef regenerate <game>", description = "Restores all floors of a game.")
	public void execute(CommandSender sender, Game game) {
		if (game == null) {
			sender.sendMessage(_("arenaDoesntExists"));
			return;
		}

		game.getComponents().regenerateFloors();
		sender.sendMessage(_("floorsRegenerated"));
	}

}
