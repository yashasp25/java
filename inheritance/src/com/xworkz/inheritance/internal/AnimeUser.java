package com.xworkz.inheritance.internal;

public class AnimeUser {
    public AnimeUser(Anime anime){
        anime.watch();
        anime.review();
        anime.recommend();
        anime.discuss();
        anime.collectMerchandise();

        if (anime instanceof OnePiece onePiece) {
            onePiece.findOnePiece();
        }
        if (anime instanceof Naruto naruto) {
            naruto.useRasengan();
        }
        if (anime instanceof AttackOnTitan titan) {
            titan.transformTitan();
        }
        if (anime instanceof DeathNote note) {
            note.writeInDeathNote();
        }
        if (anime instanceof DragonBallZ dbz) {
            dbz.kamehameha();
        }
        if (anime instanceof DemonSlayer slayer) {
            slayer.useNichirinSword();
        }
        if (anime instanceof MyHeroAcademia mha) {
            mha.useOneForAll();
        }
        if (anime instanceof TokyoRevengers revengers) {
            revengers.timeTravel();
        }
        if (anime instanceof Bleach bleach) {
            bleach.useBankai();
        }
        if (anime instanceof HunterXHunter hunter) {
            hunter.useNen();
        }
        if (anime instanceof OnePunchMan opm) {
            opm.seriousPunch();
        }
        if (anime instanceof JujutsuKaisen jjk) {
            jjk.useCursedTechnique();
        }
        if (anime instanceof VinlandSaga vinland) {
            vinland.vikingRaid();
        }
        if (anime instanceof ChainsawMan chainsaw) {
            chainsaw.chainsawTransform();
        }
        if (anime instanceof FairyTail fairyTail) {
            fairyTail.useFireDragonMagic();
        }
        if (anime instanceof SwordArtOnline sao) {
            sao.equipLegendarySword();
        }
        if (anime instanceof CodeGeass geass) {
            geass.activateGeass();
        }
        if (anime instanceof FullmetalAlchemist fma) {
            fma.humanTransmutation();
        }
        if (anime instanceof BlackClover clover) {
            clover.summonMagicBook();
        }
        if (anime instanceof SteinsGate gate) {
            gate.hackTimeLine();
        }
        if (anime instanceof Parasyte parasyte) {
            parasyte.useParasiteArm();
        }
        if (anime instanceof CowboyBebop bebop) {
            bebop.collectBounty();
        }
        if (anime instanceof NeonGenesisEvangelion eva) {
            eva.pilotEvaUnit();
        }
        if (anime instanceof ReZero rezero) {
            rezero.returnByDeath();
        }
        if (anime instanceof MobPsycho100 mob) {
            mob.usePsychicPowers();
        }
    }
}
