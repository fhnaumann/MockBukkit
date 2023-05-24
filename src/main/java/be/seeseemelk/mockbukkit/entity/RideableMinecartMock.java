package be.seeseemelk.mockbukkit.entity;

import be.seeseemelk.mockbukkit.ServerMock;
import org.bukkit.Material;
import org.bukkit.entity.minecart.RideableMinecart;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public class RideableMinecartMock extends MinecartMock implements RideableMinecart
{

	/**
	 * Constructs a new {@link RideableMinecartMock} on the provided {@link ServerMock} with a specified {@link UUID}.
	 *
	 * @param server The server to create the entity on.
	 * @param uuid   The UUID of the entity.
	 */
	public RideableMinecartMock(@NotNull ServerMock server, @NotNull UUID uuid)
	{
		super(server, uuid);
	}

	@Override
	public @NotNull Material getMinecartMaterial()
	{
		return Material.MINECART;
	}

}
