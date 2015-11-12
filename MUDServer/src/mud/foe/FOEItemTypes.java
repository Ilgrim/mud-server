
package mud.foe;

import mud.objects.ItemType;
import mud.objects.ItemTypes;

public final class FOEItemTypes {
	public static ItemType BOTTLE_CAP   = new ItemType("Bottle_Cap",   16);
	public static ItemType DISRUPTOR    = new ItemType("Disruptor",    17);
	public static ItemType MEMORY_ORB   = new ItemType("Memory_Orb",   18);
	public static ItemType PIPBUCK      = new ItemType("PipBuck",      19);
	public static ItemType STEALTH_BUCK = new ItemType("Stealth_Buck", 20);

	private FOEItemTypes() {}

	private static ItemType[] types = {
		BOTTLE_CAP, DISRUPTOR, MEMORY_ORB, PIPBUCK, STEALTH_BUCK
	};

	public static ItemType getType(final Integer typeId) {
		return types[typeId - 16];
	}

	public static ItemType getType(final String typeName) {
		switch(typeName.toUpperCase()) {
		case "BOTTLE_CAP":   return BOTTLE_CAP;
		case "DISRUPTOR":    return DISRUPTOR;
		case "MEMORY_ORB":   return MEMORY_ORB;
		case "PIPBUCK":      return PIPBUCK;
		case "STEALTH_BUCK": return STEALTH_BUCK;
		default:             return ItemTypes.NONE;
		}
	}
	
	public static ItemType[] getItemTypes() {
		return types;
	}
}