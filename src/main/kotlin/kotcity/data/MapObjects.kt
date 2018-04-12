/**
 * Basic data structures
 */
package kotcity.data

/**
 * Represents if we have ground or water
 */
enum class TileType {
    GROUND,
    WATER
}

/**
 * Type of zone, R/C/I
 */
enum class Zone {
    RESIDENTIAL,
    COMMERCIAL,
    INDUSTRIAL
}

/**
 * Represents a pair of a building and its location in the city.
 * @param coordinate (top left) coordinate of building
 * @param building building we are referring to
 */
data class Location(val coordinate: BlockCoordinate, val building: Building) {
    fun blocks(): List<BlockCoordinate> {
        return building.buildingBlocks(coordinate)
    }
}
