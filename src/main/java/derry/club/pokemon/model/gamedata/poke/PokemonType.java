package derry.club.pokemon.model.gamedata.poke;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import derry.club.pokemon.model.gamedata.poke.deserializer.PokemonTypeDeserializer;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(using = PokemonTypeDeserializer.class)
public enum PokemonType {
    UNKNOWN,
    BUG,
    BUG_DRAGON,
    BUG_ELECTRIC,
    BUG_FIGHTING,
    BUG_FIRE,
    BUG_FLYING,
    BUG_GHOST,
    BUG_GRASS,
    BUG_GROUND,
    BUG_ICE,
    BUG_NORMAL,
    BUG_POISON,
    BUG_PSYCHIC,
    BUG_ROCK,
    BUG_WATER,
    DRAGON,
    DRAGON_BUG,
    DRAGON_ELECTRIC,
    DRAGON_FIGHTING,
    DRAGON_FIRE,
    DRAGON_FLYING,
    DRAGON_GHOST,
    DRAGON_GRASS,
    DRAGON_GROUND,
    DRAGON_ICE,
    DRAGON_NORMAL,
    DRAGON_POISON,
    DRAGON_PSYCHIC,
    DRAGON_ROCK,
    DRAGON_WATER,
    ELECTRIC,
    ELECTRIC_BUG,
    ELECTRIC_DRAGON,
    ELECTRIC_FIGHTING,
    ELECTRIC_FIRE,
    ELECTRIC_FLYING,
    ELECTRIC_GHOST,
    ELECTRIC_GRASS,
    ELECTRIC_GROUND,
    ELECTRIC_ICE,
    ELECTRIC_NORMAL,
    ELECTRIC_POISON,
    ELECTRIC_PSYCHIC,
    ELECTRIC_ROCK,
    ELECTRIC_WATER,
    FIGHTING,
    FIGHTING_BUG,
    FIGHTING_DRAGON,
    FIGHTING_ELECTRIC,
    FIGHTING_FIRE,
    FIGHTING_FLYING,
    FIGHTING_GHOST,
    FIGHTING_GRASS,
    FIGHTING_GROUND,
    FIGHTING_ICE,
    FIGHTING_NORMAL,
    FIGHTING_POISON,
    FIGHTING_PSYCHIC,
    FIGHTING_ROCK,
    FIGHTING_WATER,
    FIRE,
    FIRE_BUG,
    FIRE_DRAGON,
    FIRE_ELECTRIC,
    FIRE_FIGHTING,
    FIRE_FLYING,
    FIRE_GHOST,
    FIRE_GRASS,
    FIRE_GROUND,
    FIRE_ICE,
    FIRE_NORMAL,
    FIRE_POISON,
    FIRE_PSYCHIC,
    FIRE_ROCK,
    FIRE_WATER,
    FLYING,
    FLYING_BUG,
    FLYING_DRAGON,
    FLYING_ELECTRIC,
    FLYING_FIGHTING,
    FLYING_FIRE,
    FLYING_GHOST,
    FLYING_GRASS,
    FLYING_GROUND,
    FLYING_ICE,
    FLYING_NORMAL,
    FLYING_POISON,
    FLYING_PSYCHIC,
    FLYING_ROCK,
    FLYING_WATER,
    GHOST,
    GHOST_BUG,
    GHOST_DRAGON,
    GHOST_ELECTRIC,
    GHOST_FIGHTING,
    GHOST_FIRE,
    GHOST_FLYING,
    GHOST_GRASS,
    GHOST_GROUND,
    GHOST_ICE,
    GHOST_NORMAL,
    GHOST_POISON,
    GHOST_PSYCHIC,
    GHOST_ROCK,
    GHOST_WATER,
    GRASS,
    GRASS_BUG,
    GRASS_DRAGON,
    GRASS_ELECTRIC,
    GRASS_FIGHTING,
    GRASS_FIRE,
    GRASS_FLYING,
    GRASS_GHOST,
    GRASS_GROUND,
    GRASS_ICE,
    GRASS_NORMAL,
    GRASS_POISON,
    GRASS_PSYCHIC,
    GRASS_ROCK,
    GRASS_WATER,
    GROUND,
    GROUND_BUG,
    GROUND_DRAGON,
    GROUND_ELECTRIC,
    GROUND_FIGHTING,
    GROUND_FIRE,
    GROUND_FLYING,
    GROUND_GHOST,
    GROUND_GRASS,
    GROUND_ICE,
    GROUND_NORMAL,
    GROUND_POISON,
    GROUND_PSYCHIC,
    GROUND_ROCK,
    GROUND_WATER,
    ICE,
    ICE_BUG,
    ICE_DRAGON,
    ICE_ELECTRIC,
    ICE_FIGHTING,
    ICE_FIRE,
    ICE_FLYING,
    ICE_GHOST,
    ICE_GRASS,
    ICE_GROUND,
    ICE_NORMAL,
    ICE_POISON,
    ICE_PSYCHIC,
    ICE_ROCK,
    ICE_WATER,
    NORMAL,
    NORMAL_BUG,
    NORMAL_DRAGON,
    NORMAL_ELECTRIC,
    NORMAL_FIGHTING,
    NORMAL_FIRE,
    NORMAL_FLYING,
    NORMAL_GHOST,
    NORMAL_GRASS,
    NORMAL_GROUND,
    NORMAL_ICE,
    NORMAL_POISON,
    NORMAL_PSYCHIC,
    NORMAL_ROCK,
    NORMAL_WATER,
    POISON,
    POISON_BUG,
    POISON_DRAGON,
    POISON_ELECTRIC,
    POISON_FIGHTING,
    POISON_FIRE,
    POISON_FLYING,
    POISON_GHOST,
    POISON_GRASS,
    POISON_GROUND,
    POISON_ICE,
    POISON_NORMAL,
    POISON_PSYCHIC,
    POISON_ROCK,
    POISON_WATER,
    PSYCHIC,
    PSYCHIC_BUG,
    PSYCHIC_DRAGON,
    PSYCHIC_ELECTRIC,
    PSYCHIC_FIGHTING,
    PSYCHIC_FIRE,
    PSYCHIC_FLYING,
    PSYCHIC_GHOST,
    PSYCHIC_GRASS,
    PSYCHIC_GROUND,
    PSYCHIC_ICE,
    PSYCHIC_NORMAL,
    PSYCHIC_POISON,
    PSYCHIC_ROCK,
    PSYCHIC_WATER,
    ROCK,
    ROCK_BUG,
    ROCK_DRAGON,
    ROCK_ELECTRIC,
    ROCK_FIGHTING,
    ROCK_FIRE,
    ROCK_FLYING,
    ROCK_GHOST,
    ROCK_GRASS,
    ROCK_GROUND,
    ROCK_ICE,
    ROCK_NORMAL,
    ROCK_POISON,
    ROCK_PSYCHIC,
    ROCK_WATER,
    WATER,
    WATER_BUG,
    WATER_DRAGON,
    WATER_ELECTRIC,
    WATER_FIGHTING,
    WATER_FIRE,
    WATER_FLYING,
    WATER_GHOST,
    WATER_GRASS,
    WATER_GROUND,
    WATER_ICE,
    WATER_NORMAL,
    WATER_POISON,
    WATER_PSYCHIC,
    WATER_ROCK;
}
