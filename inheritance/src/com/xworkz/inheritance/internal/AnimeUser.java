package com.xworkz.inheritance.internal;

public class AnimeUser {
    public AnimeUser() {
        System.out.println("Anime user const");
    }

    public void accountuse(Anime anime) {
        anime.watch();
        anime.review();
        anime.recommend();
        anime.discuss();
        anime.collectMerchandise();

        if (anime instanceof OnePiece) {
            OnePiece onePiece = (OnePiece) anime;
            onePiece.findOnePiece();
        }
        if (anime instanceof Naruto) {
            Naruto naruto = (Naruto) anime;
            naruto.useRasengan();
        }
        if (anime instanceof AttackOnTitan) {
            AttackOnTitan titan = (AttackOnTitan) anime;
            titan.transformTitan();
        }
        if (anime instanceof DeathNote) {
            DeathNote note = (DeathNote) anime;
            note.writeInDeathNote();
        }
        if (anime instanceof DragonBallZ) {
            DragonBallZ dbz = (DragonBallZ) anime;
            dbz.kamehameha();
        }
        if (anime instanceof DemonSlayer) {
            DemonSlayer slayer = (DemonSlayer) anime;
            slayer.useNichirinSword();
        }
        if (anime instanceof MyHeroAcademia) {
            MyHeroAcademia mha = (MyHeroAcademia) anime;
            mha.useOneForAll();
        }
        if (anime instanceof TokyoRevengers) {
            TokyoRevengers revengers = (TokyoRevengers) anime;
            revengers.timeTravel();
        }
        if (anime instanceof Bleach) {
            Bleach bleach = (Bleach) anime;
            bleach.useBankai();
        }
        if (anime instanceof HunterXHunter) {
            HunterXHunter hunter = (HunterXHunter) anime;
            hunter.useNen();
        }
        if (anime instanceof OnePunchMan) {
            OnePunchMan opm = (OnePunchMan) anime;
            opm.seriousPunch();
        }
        if (anime instanceof JujutsuKaisen) {
            JujutsuKaisen jjk = (JujutsuKaisen) anime;
            jjk.useCursedTechnique();
        }
        if (anime instanceof VinlandSaga) {
            VinlandSaga vinland = (VinlandSaga) anime;
            vinland.vikingRaid();
        }
        if (anime instanceof ChainsawMan) {
            ChainsawMan chainsaw = (ChainsawMan) anime;
            chainsaw.chainsawTransform();
        }
        if (anime instanceof FairyTail) {
            FairyTail fairyTail = (FairyTail) anime;
            fairyTail.useFireDragonMagic();
        }
        if (anime instanceof SwordArtOnline) {
            SwordArtOnline sao = (SwordArtOnline) anime;
            sao.equipLegendarySword();
        }
        if (anime instanceof CodeGeass) {
            CodeGeass geass = (CodeGeass) anime;
            geass.activateGeass();
        }
        if (anime instanceof FullmetalAlchemist) {
            FullmetalAlchemist fma = (FullmetalAlchemist) anime;
            fma.humanTransmutation();
        }
        if (anime instanceof BlackClover) {
            BlackClover clover = (BlackClover) anime;
            clover.summonMagicBook();
        }
        if (anime instanceof SteinsGate) {
            SteinsGate gate = (SteinsGate) anime;
            gate.hackTimeLine();
        }
        if (anime instanceof Parasyte) {
            Parasyte parasyte = (Parasyte) anime;
            parasyte.useParasiteArm();
        }
        if (anime instanceof CowboyBebop) {
            CowboyBebop bebop = (CowboyBebop) anime;
            bebop.collectBounty();
        }
        if (anime instanceof NeonGenesisEvangelion) {
            NeonGenesisEvangelion eva = (NeonGenesisEvangelion) anime;
            eva.pilotEvaUnit();
        }
        if (anime instanceof ReZero) {
            ReZero rezero = (ReZero) anime;
            rezero.returnByDeath();
        }
        if (anime instanceof MobPsycho100) {
            MobPsycho100 mob = (MobPsycho100) anime;
            mob.usePsychicPowers();
        }
    }
}

