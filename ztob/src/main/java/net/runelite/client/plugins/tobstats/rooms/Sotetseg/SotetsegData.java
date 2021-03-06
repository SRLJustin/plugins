package net.runelite.client.plugins.tobstats.rooms.Sotetseg;

import lombok.Data;
import lombok.EqualsAndHashCode;
import net.runelite.client.plugins.tobstats.RoomData;

@Data
@EqualsAndHashCode(callSuper = true)
public class SotetsegData extends RoomData
{
    private Integer p1 = null;
    private Integer p2 = null;

    static final String UPDATE_VALUES_QUERY = "insert into Sotetseg (id, p1, p2) values (:id, :p1, :p2)";
}
