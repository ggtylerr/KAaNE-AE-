package com.ggtylerr.kaane_ae;

import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.preference.PreferenceManager;

import com.ggtylerr.kaane_ae.util.Props;
import com.ggtylerr.kaane_ae.util.log;
import com.ggtylerr.kaane_ae.util.string;

import java.io.FileWriter;
import java.util.Properties;

public class BombSettings extends Fragment {
    private static Properties props;
    private static String sn;
    private static long startTime;
    private static long endTime;
    private static long calcTime;
    private CheckBox bobCB;
    private CheckBox carCB;
    private CheckBox clrCB;
    private CheckBox frkCB;
    private CheckBox frqCB;
    private CheckBox indCB;
    private CheckBox msaCB;
    private CheckBox nsaCB;
    private CheckBox sigCB;
    private CheckBox sndCB;
    private CheckBox trnCB;
    private CheckBox bobLitCB;
    private CheckBox carLitCB;
    private CheckBox clrLitCB;
    private CheckBox frkLitCB;
    private CheckBox frqLitCB;
    private CheckBox indLitCB;
    private CheckBox msaLitCB;
    private CheckBox nsaLitCB;
    private CheckBox sigLitCB;
    private CheckBox sndLitCB;
    private CheckBox trnLitCB;
    private EditText aaTxt;
    private EditText dTxt;
    private EditText dvidTxt;
    private EditText parallelTxt;
    private EditText ps2Txt;
    private EditText rj45Txt;
    private EditText serialTxt;
    private EditText stereoRCATxt;
    private EditText snTxt;
    private EditText moduleTxt;
    private EditText plateTxt;
    private EditText modIndTxt;
    private EditText modPortTxt;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        startTime = System.nanoTime();
        ScrollView sv = (ScrollView) inflater.inflate(R.layout.fragment_bomb_settings, container, false);
        // Property Handling
        props = new Properties();
        props = Props.load(props);
        log.print("Bomb Settings: Loading Props");
        // Define widgets/stuff
        bobCB = sv.findViewById(R.id.bobCB);
        carCB = sv.findViewById(R.id.carCB);
        clrCB = sv.findViewById(R.id.clrCB);
        frkCB = sv.findViewById(R.id.frkCB);
        frqCB = sv.findViewById(R.id.frqCB);
        indCB = sv.findViewById(R.id.indCB);
        msaCB = sv.findViewById(R.id.msaCB);
        nsaCB = sv.findViewById(R.id.nsaCB);
        sigCB = sv.findViewById(R.id.sigCB);
        sndCB = sv.findViewById(R.id.sndCB);
        trnCB = sv.findViewById(R.id.trnCB);
        bobLitCB = sv.findViewById(R.id.bobLitCB);
        carLitCB = sv.findViewById(R.id.carLitCB);
        clrLitCB = sv.findViewById(R.id.clrLitCB);
        frkLitCB = sv.findViewById(R.id.frkLitCB);
        frqLitCB = sv.findViewById(R.id.frqLitCB);
        indLitCB = sv.findViewById(R.id.indLitCB);
        msaLitCB = sv.findViewById(R.id.msaLitCB);
        nsaLitCB = sv.findViewById(R.id.nsaLitCB);
        sigLitCB = sv.findViewById(R.id.sigLitCB);
        sndLitCB = sv.findViewById(R.id.sndLitCB);
        trnLitCB = sv.findViewById(R.id.trnLitCB);
        aaTxt = sv.findViewById(R.id.aaTXT);
        dTxt = sv.findViewById(R.id.dTXT);
        dvidTxt = sv.findViewById(R.id.dvidTXT);
        parallelTxt = sv.findViewById(R.id.parallelTXT);
        ps2Txt = sv.findViewById(R.id.ps2TXT);
        rj45Txt = sv.findViewById(R.id.rj45TXT);
        serialTxt = sv.findViewById(R.id.serialTXT);
        stereoRCATxt = sv.findViewById(R.id.stereoRCATXT);
        snTxt = sv.findViewById(R.id.snTXT);
        moduleTxt = sv.findViewById(R.id.moduleTXT);
        plateTxt = sv.findViewById(R.id.plateTXT);
        modIndTxt = sv.findViewById(R.id.modIndTXT);
        modPortTxt = sv.findViewById(R.id.modPortTXT);
        // Mirror Settings to Properties
        if (Integer.parseInt(props.getProperty("bob")) == 1) bobCB.setChecked(true);
        log.printExclog("BOB value: " + props.getProperty("bob"));
        if (Integer.parseInt(props.getProperty("bobLit")) == 1) bobLitCB.setChecked(true);
        log.printExclog("Lit BOB value: " + props.getProperty("bobLit"));
        if (Integer.parseInt(props.getProperty("car")) == 1) carCB.setChecked(true);
        log.printExclog("CAR value: " + props.getProperty("car"));
        if (Integer.parseInt(props.getProperty("carLit")) == 1) carLitCB.setChecked(true);
        log.printExclog("Lit CAR value: " + props.getProperty("carLit"));
        if (Integer.parseInt(props.getProperty("clr")) == 1) clrCB.setChecked(true);
        log.printExclog("CLR value: " + props.getProperty("clr"));
        if (Integer.parseInt(props.getProperty("clrLit")) == 1) clrLitCB.setChecked(true);
        log.printExclog("Lit CLR value: " + props.getProperty("clrLit"));
        if (Integer.parseInt(props.getProperty("frk")) == 1) frkCB.setChecked(true);
        log.printExclog("FRK value: " + props.getProperty("frk"));
        if (Integer.parseInt(props.getProperty("frkLit")) == 1) frkLitCB.setChecked(true);
        log.printExclog("Lit FRK value: " + props.getProperty("frkLit"));
        if (Integer.parseInt(props.getProperty("frq")) == 1) frqCB.setChecked(true);
        log.printExclog("FRQ value: " + props.getProperty("frq"));
        if (Integer.parseInt(props.getProperty("frqLit")) == 1) frqLitCB.setChecked(true);
        log.printExclog("Lit FRQ value: " + props.getProperty("frqLit"));
        if (Integer.parseInt(props.getProperty("ind")) == 1) indCB.setChecked(true);
        log.printExclog("IND value: " + props.getProperty("ind"));
        if (Integer.parseInt(props.getProperty("indLit")) == 1) indLitCB.setChecked(true);
        log.printExclog("Lit IND value: " + props.getProperty("indLit"));
        if (Integer.parseInt(props.getProperty("msa")) == 1) msaCB.setChecked(true);
        log.printExclog("MSA value: " + props.getProperty("msa"));
        if (Integer.parseInt(props.getProperty("msaLit")) == 1) msaLitCB.setChecked(true);
        log.printExclog("Lit MSA value: " + props.getProperty("msaLit"));
        if (Integer.parseInt(props.getProperty("nsa")) == 1) nsaCB.setChecked(true);
        log.printExclog("NSA value: " + props.getProperty("nsa"));
        if (Integer.parseInt(props.getProperty("nsaLit")) == 1) nsaLitCB.setChecked(true);
        log.printExclog("Lit NSA value: " + props.getProperty("nsaLit"));
        if (Integer.parseInt(props.getProperty("sig")) == 1) sigCB.setChecked(true);
        log.printExclog("SIG value: " + props.getProperty("sig"));
        if (Integer.parseInt(props.getProperty("sigLit")) == 1) sigLitCB.setChecked(true);
        log.printExclog("Lit SIG value: " + props.getProperty("sigLit"));
        if (Integer.parseInt(props.getProperty("snd")) == 1) sndCB.setChecked(true);
        log.printExclog("SND value: " + props.getProperty("snd"));
        if (Integer.parseInt(props.getProperty("sndLit")) == 1) sndLitCB.setChecked(true);
        log.printExclog("Lit SND value: " + props.getProperty("sndLit"));
        if (Integer.parseInt(props.getProperty("trn")) == 1) trnCB.setChecked(true);
        log.printExclog("TRN value: " + props.getProperty("trn"));
        if (Integer.parseInt(props.getProperty("trnLit")) == 1) trnLitCB.setChecked(true);
        log.printExclog("Lit TRN value: " + props.getProperty("trnLit"));
        aaTxt.setText(props.getProperty("batteriesAA"));
        log.printExclog("AA Batteries value: " + props.getProperty("batteriesAA"));
        dTxt.setText(props.getProperty("batteriesD"));
        log.printExclog("D Batteries value: " + props.getProperty("batteriesD"));
        dvidTxt.setText(props.getProperty("dvidQuantity"));
        log.printExclog("DVI-D value: " + props.getProperty("dvidQuantity"));
        parallelTxt.setText(props.getProperty("parallelQuantity"));
        log.printExclog("Parallel value: " + props.getProperty("parallelQuantity"));
        ps2Txt.setText(props.getProperty("ps2Quantity"));
        log.printExclog("PS/2 value: " + props.getProperty("ps2Quantity"));
        rj45Txt.setText(props.getProperty("rj45Quantity"));
        log.printExclog("RJ-45 value: " + props.getProperty("rj45Quantity"));
        serialTxt.setText(props.getProperty("serialQuantity"));
        log.printExclog("Serial value: " + props.getProperty("serialQuantity"));
        stereoRCATxt.setText(props.getProperty("stereoRCAQuantity"));
        log.printExclog("Stereo RCA value: " + props.getProperty("stereoRCAQuantity"));
        sn = props.getProperty("sn1") + props.getProperty("sn2") + props.getProperty("sn3") +
                props.getProperty("sn4") + props.getProperty("sn5") + props.getProperty("sn6");
        snTxt.setText(sn);
        log.printExclog("SN 1 value: " + props.getProperty("sn1"));
        log.printExclog("SN 2 value: " + props.getProperty("sn2"));
        log.printExclog("SN 3 value: " + props.getProperty("sn3"));
        log.printExclog("SN 4 value: " + props.getProperty("sn4"));
        log.printExclog("SN 5 value: " + props.getProperty("sn5"));
        log.printExclog("SN 6 value: " + props.getProperty("sn6"));
        log.printExclog("SN Full value: " + sn);
        moduleTxt.setText(props.getProperty("modules"));
        log.printExclog("Module value: " + props.getProperty("modules"));
        plateTxt.setText(props.getProperty("plates"));
        log.printExclog("Port Plates value: " + props.getProperty("plates"));
        modIndTxt.setText(props.getProperty("modInd"));
        log.printExclog("Mod Indicator value: " + props.getProperty("modInd"));
        modPortTxt.setText(props.getProperty("modPort"));
        log.printExclog("Mod Port value: " + props.getProperty("modPort"));
        // Add/Remove Buttons
        // AA Add
        ImageButton currBtn = sv.findViewById(R.id.aaAddBTN);
        currBtn.setOnClickListener((View v) -> {
            log.printExclog("Click listened: AA Batt. Add");
            aaTxt.setText(add(aaTxt,true));
        });
        // AA Remove
        currBtn = sv.findViewById(R.id.aaRmvBTN);
        currBtn.setOnClickListener((View v) -> {
            log.printExclog("Click listened: AA Batt. Remove");
            aaTxt.setText(remove(aaTxt,true));
        });
        // D Add
        currBtn = sv.findViewById(R.id.dAddBTN);
        currBtn.setOnClickListener((View v) -> {
            log.printExclog("Click listened: D Batt. Add");
            dTxt.setText(add(dTxt,false));
        });
        // D Remove
        currBtn = sv.findViewById(R.id.dRmvBTN);
        currBtn.setOnClickListener((View v) -> {
            log.printExclog("Click listened: D Batt. Remove");
            dTxt.setText(remove(dTxt,false));
        });
        // DVI-D Add
        currBtn = sv.findViewById(R.id.dvidAddBTN);
        currBtn.setOnClickListener((View v) -> {
            log.printExclog("Click listened: DVI-D Add");
            dvidTxt.setText(add(dvidTxt,false));
        });
        // DVI-D Remove
        currBtn = sv.findViewById(R.id.dvidRmvBTN);
        currBtn.setOnClickListener((View v) -> {
            log.printExclog("Click listened: DVI-D Remove");
            dvidTxt.setText(remove(dvidTxt,false));
        });
        // Parallel Add
        currBtn = sv.findViewById(R.id.parallelAddBTN);
        currBtn.setOnClickListener((View v) -> {
            log.printExclog("Click listened: Parallel Add");
            parallelTxt.setText(add(parallelTxt,false));
        });
        // Parallel Remove
        currBtn = sv.findViewById(R.id.parallelRmvBTN);
        currBtn.setOnClickListener((View v) -> {
            log.printExclog("Click listened: Parallel Remove");
            parallelTxt.setText(remove(parallelTxt,false));
        });
        // PS/2 Add
        currBtn = sv.findViewById(R.id.ps2AddBTN);
        currBtn.setOnClickListener((View v) -> {
            log.printExclog("Click listened: PS/2 Add");
            ps2Txt.setText(add(ps2Txt,false));
        });
        // PS/2 Remove
        currBtn = sv.findViewById(R.id.ps2RmvBTN);
        currBtn.setOnClickListener((View v) -> {
            log.printExclog("Click listened: PS/2 Remove");
            ps2Txt.setText(remove(ps2Txt,false));
        });
        // RJ-45 Add
        currBtn = sv.findViewById(R.id.rj45AddBTN);
        currBtn.setOnClickListener((View v) -> {
            log.printExclog("Click listened: RJ-45 Add");
            rj45Txt.setText(add(rj45Txt,false));
        });
        // RJ-45 Remove
        currBtn = sv.findViewById(R.id.rj45RmvBTN);
        currBtn.setOnClickListener((View v) -> {
            log.printExclog("Click listened: RJ-45 Remove");
            rj45Txt.setText(remove(rj45Txt,false));
        });
        // Serial Add
        currBtn = sv.findViewById(R.id.serialAddBTN);
        currBtn.setOnClickListener((View v) -> {
            log.printExclog("Click listened: Serial Add");
            serialTxt.setText(add(serialTxt,false));
        });
        // Serial Remove
        currBtn = sv.findViewById(R.id.serialRmvBTN);
        currBtn.setOnClickListener((View v) -> {
            log.printExclog("Click listened: Serial Remove");
            serialTxt.setText(remove(serialTxt,false));
        });
        // Stereo RCA Add
        currBtn = sv.findViewById(R.id.stereoRCAAddBTN);
        currBtn.setOnClickListener((View v) -> {
            log.printExclog("Click listened: Stereo RCA Add");
            stereoRCATxt.setText(add(stereoRCATxt,false));
        });
        // Stereo RCA Remove
        currBtn = sv.findViewById(R.id.stereoRCARmvBTN);
        currBtn.setOnClickListener((View v) -> {
            log.printExclog("Click listened: Stereo RCA Remove");
            stereoRCATxt.setText(remove(stereoRCATxt,false));
        });
        // Port Plate Add
        currBtn = sv.findViewById(R.id.plateAddBTN);
        currBtn.setOnClickListener((View v) -> {
            log.printExclog("Click listened: Plate Add");
            plateTxt.setText(add(plateTxt,false));
        });
        // Port Plate Remove
        currBtn = sv.findViewById(R.id.plateRmvBTN);
        currBtn.setOnClickListener((View v) -> {
            log.printExclog("Click listened: Plate Remove");
            plateTxt.setText(remove(plateTxt,false));
        });
        // Mod Indicator Add
        currBtn = sv.findViewById(R.id.modIndAddBTN);
        currBtn.setOnClickListener((View v) -> {
            log.printExclog("Click listened: Mod Indicator Add");
            modIndTxt.setText(add(modIndTxt,false));
        });
        // Mod Indicator Remove
        currBtn = sv.findViewById(R.id.modIndRmvBTN);
        currBtn.setOnClickListener((View v) -> {
            log.printExclog("Click listened: Mod Indicator Remove");
            modIndTxt.setText(remove(modIndTxt,false));
        });
        // Mod Port Add
        currBtn = sv.findViewById(R.id.modPortAddBTN);
        currBtn.setOnClickListener((View v) -> {
            log.printExclog("Click listened: Mod Port Add");
            modPortTxt.setText(add(modPortTxt,false));
        });
        // Mod Port Remove
        currBtn = sv.findViewById(R.id.modPortRmvBTN);
        currBtn.setOnClickListener((View v) -> {
            log.printExclog("Click listened: Mod Port Remove");
            modPortTxt.setText(remove(modPortTxt,false));
        });
        // Modules Add
        currBtn = sv.findViewById(R.id.moduleAddBTN);
        currBtn.setOnClickListener((View v) -> moduleTxt.setText(add(moduleTxt,false)));
        // Modules Remove
        currBtn = sv.findViewById(R.id.moduleRmvBTN);
        currBtn.setOnClickListener((View v) -> moduleTxt.setText(remove(moduleTxt,false)));
        // Saving
        AppCompatButton currNormalBtn = sv.findViewById(R.id.saveBtn);
        currNormalBtn.setOnClickListener((View v) -> {
            startTime = System.nanoTime();
            log.printExclog("Click listened: Save button");
            // indicators
            int inds = 0;
            int litInds = 0;
            int unlitInds = 0;
            bobCB = sv.findViewById(R.id.bobCB);
            bobLitCB = sv.findViewById(R.id.bobLitCB);
            if (bobCB.isChecked()) {
                log.printExclog("BOB is checked - Setting property \"bob\" to 1.");
                props.setProperty("bob","1");
                if (bobLitCB.isChecked()) {
                    log.printExclog("Lit BOB is checked - Setting property \"bobLit\" to 1 and \"bobUnlit\" to 0.");
                    props.setProperty("bobLit","1");
                    props.setProperty("bobUnlit","0");
                    log.printExclog("Adding 1 to litInds.");
                    litInds++;
                } else {
                    log.printExclog("Lit BOB is unchecked - Setting property \"bobLit\" to 0 and \"bobUnlit\" to 1.");
                    props.setProperty("bobLit","0");
                    props.setProperty("bobUnlit","1");
                    log.printExclog("Adding 1 to unlitInds.");
                    unlitInds++;
                }
                log.printExclog("Adding 1 to inds.");
                inds++;
            } else {
                log.printExclog("BOB is unchecked - Setting all related properties to 0.");
                props.setProperty("bob","0");
                props.setProperty("bobLit","0");
                props.setProperty("bobUnlit","0");
                bobLitCB.setChecked(false);
            }
            carCB = sv.findViewById(R.id.carCB);
            carLitCB = sv.findViewById(R.id.carLitCB);
            if (carCB.isChecked()) {
                log.printExclog("CAR is checked - Setting property \"car\" to 1.");
                props.setProperty("car","1");
                if (carLitCB.isChecked()) {
                    log.printExclog("Lit CAR is checked - Setting property \"carLit\" to 1 and \"carUnlit\" to 0.");
                    props.setProperty("carLit","1");
                    props.setProperty("carUnlit","0");
                    log.printExclog("Adding 1 to litInds.");
                    litInds++;
                } else {
                    log.printExclog("Lit CAR is unchecked - Setting property \"carLit\" to 0 and \"carUnlit\" to 1.");
                    props.setProperty("carLit","0");
                    props.setProperty("carUnlit","1");
                    log.printExclog("Adding 1 to unlitInds.");
                    unlitInds++;
                }
                log.printExclog("Adding 1 to inds.");
                inds++;
            } else {
                log.printExclog("CAR is unchecked - Setting all related properties to 0.");
                props.setProperty("car","0");
                props.setProperty("carLit","0");
                props.setProperty("carUnlit","0");
                carLitCB.setChecked(false);
            }
            clrCB = sv.findViewById(R.id.clrCB);
            clrLitCB = sv.findViewById(R.id.clrLitCB);
            if (clrCB.isChecked()) {
                log.printExclog("CLR is checked - Setting property \"clr\" to 1.");
                props.setProperty("clr","1");
                if (clrLitCB.isChecked()) {
                    log.printExclog("Lit CLR is checked - Setting property \"clrLit\" to 1 and \"clrUnlit\" to 0.");
                    props.setProperty("clrLit","1");
                    props.setProperty("clrUnlit","0");
                    log.printExclog("Adding 1 to litInds.");
                    litInds++;
                } else {
                    log.printExclog("Lit CLR is unchecked - Setting property \"clrLit\" to 0 and \"clrUnlit\" to 1.");
                    props.setProperty("clrLit","0");
                    props.setProperty("clrUnlit","1");
                    log.printExclog("Adding 1 to unlitInds.");
                    unlitInds++;
                }
                log.printExclog("Adding 1 to inds.");
                inds++;
            } else {
                log.printExclog("CLR is unchecked - Setting all related properties to 0.");
                props.setProperty("clr","0");
                props.setProperty("clrLit","0");
                props.setProperty("clrUnlit","0");
                clrLitCB.setChecked(false);
            }
            frkCB = sv.findViewById(R.id.frkCB);
            frkLitCB = sv.findViewById(R.id.frkLitCB);
            if (frkCB.isChecked()) {
                log.printExclog("FRK is checked - Setting property \"frk\" to 1.");
                props.setProperty("frk","1");
                if (frkLitCB.isChecked()) {
                    log.printExclog("Lit FRK is checked - Setting property \"frkLit\" to 1 and \"frkUnlit\" to 0.");
                    props.setProperty("frkLit","1");
                    props.setProperty("frkUnlit","0");
                    log.printExclog("Adding 1 to litInds.");
                    litInds++;
                } else {
                    log.printExclog("Lit FRK is unchecked - Setting property \"frkLit\" to 0 and \"frkUnlit\" to 1.");
                    props.setProperty("frkLit","0");
                    props.setProperty("frkUnlit","1");
                    log.printExclog("Adding 1 to unlitInds.");
                    unlitInds++;
                }
                log.printExclog("Adding 1 to inds.");
                inds++;
            } else {
                log.printExclog("FRK is unchecked - Setting all related properties to 0.");
                props.setProperty("frk","0");
                props.setProperty("frkLit","0");
                props.setProperty("frkUnlit","0");
                frkLitCB.setChecked(false);
            }
            frqCB = sv.findViewById(R.id.frqCB);
            frqLitCB = sv.findViewById(R.id.frqLitCB);
            if (frqCB.isChecked()) {
                log.printExclog("FRQ is checked - Setting property \"frq\" to 1.");
                props.setProperty("frq","1");
                if (frqLitCB.isChecked()) {
                    log.printExclog("Lit FRQ is checked - Setting property \"frqLit\" to 1 and \"frqUnlit\" to 0.");
                    props.setProperty("frqLit","1");
                    props.setProperty("frqUnlit","0");
                    log.printExclog("Adding 1 to litInds.");
                    litInds++;
                } else {
                    log.printExclog("Lit FRQ is unchecked - Setting property \"frqLit\" to 0 and \"frqUnlit\" to 1.");
                    props.setProperty("frqLit","0");
                    props.setProperty("frqUnlit","1");
                    log.printExclog("Adding 1 to unlitInds.");
                    unlitInds++;
                }
                log.printExclog("Adding 1 to inds.");
                inds++;
            } else {
                log.printExclog("FRQ is unchecked - Setting all related properties to 0.");
                props.setProperty("frq","0");
                props.setProperty("frqLit","0");
                props.setProperty("frqUnlit","0");
                frqLitCB.setChecked(false);
            }
            indCB = sv.findViewById(R.id.indCB);
            indLitCB = sv.findViewById(R.id.indLitCB);
            if (indCB.isChecked()) {
                log.printExclog("IND is checked - Setting property \"ind\" to 1.");
                props.setProperty("ind","1");
                if (indLitCB.isChecked()) {
                    log.printExclog("Lit IND is checked - Setting property \"indLit\" to 1 and \"indUnlit\" to 0.");
                    props.setProperty("indLit","1");
                    props.setProperty("indUnlit","0");
                    log.printExclog("Adding 1 to litInds.");
                    litInds++;
                } else {
                    log.printExclog("Lit IND is unchecked - Setting property \"indLit\" to 0 and \"indUnlit\" to 1.");
                    props.setProperty("indLit","0");
                    props.setProperty("indUnlit","1");
                    log.printExclog("Adding 1 to unlitInds.");
                    unlitInds++;
                }
                log.printExclog("Adding 1 to inds.");
                inds++;
            } else {
                log.printExclog("IND is unchecked - Setting all related properties to 0.");
                props.setProperty("ind","0");
                props.setProperty("indLit","0");
                props.setProperty("indUnlit","0");
                indLitCB.setChecked(false);
            }
            msaCB = sv.findViewById(R.id.msaCB);
            msaLitCB = sv.findViewById(R.id.msaLitCB);
            if (msaCB.isChecked()) {
                log.printExclog("MSA is checked - Setting property \"msa\" to 1.");
                props.setProperty("msa","1");
                if (msaLitCB.isChecked()) {
                    log.printExclog("Lit MSA is checked - Setting property \"msaLit\" to 1 and \"msaUnlit\" to 0.");
                    props.setProperty("msaLit","1");
                    props.setProperty("msaUnlit","0");
                    log.printExclog("Adding 1 to litInds.");
                    litInds++;
                } else {
                    log.printExclog("Lit MSA is unchecked - Setting property \"msaLit\" to 0 and \"msaUnlit\" to 1.");
                    props.setProperty("msaLit","0");
                    props.setProperty("msaUnlit","1");
                    log.printExclog("Adding 1 to unlitInds.");
                    unlitInds++;
                }
                log.printExclog("Adding 1 to inds.");
                inds++;
            } else {
                log.printExclog("MSA is unchecked - Setting all related properties to 0.");
                props.setProperty("msa","0");
                props.setProperty("msaLit","0");
                props.setProperty("msaUnlit","0");
                msaLitCB.setChecked(false);
            }
            nsaCB = sv.findViewById(R.id.nsaCB);
            nsaLitCB = sv.findViewById(R.id.nsaLitCB);
            if (nsaCB.isChecked()) {
                log.printExclog("NSA is checked - Setting property \"nsa\" to 1.");
                props.setProperty("nsa","1");
                if (nsaLitCB.isChecked()) {
                    log.printExclog("Lit NSA is checked - Setting property \"nsaLit\" to 1 and \"nsaUnlit\" to 0.");
                    props.setProperty("nsaLit","1");
                    props.setProperty("nsaUnlit","0");
                    log.printExclog("Adding 1 to litInds.");
                    litInds++;
                } else {
                    log.printExclog("Lit NSA is unchecked - Setting property \"nsaLit\" to 0 and \"nsaUnlit\" to 1.");
                    props.setProperty("nsaLit","0");
                    props.setProperty("nsaUnlit","1");
                    log.printExclog("Adding 1 to unlitInds.");
                    unlitInds++;
                }
                log.printExclog("Adding 1 to inds.");
                inds++;
            } else {
                log.printExclog("NSA is unchecked - Setting all related properties to 0.");
                props.setProperty("nsa","0");
                props.setProperty("nsaLit","0");
                props.setProperty("nsaUnlit","0");
                nsaLitCB.setChecked(false);
            }
            sigCB = sv.findViewById(R.id.sigCB);
            sigLitCB = sv.findViewById(R.id.sigLitCB);
            if (sigCB.isChecked()) {
                log.printExclog("SIG is checked - Setting property \"sig\" to 1.");
                props.setProperty("sig","1");
                if (sigLitCB.isChecked()) {
                    log.printExclog("Lit SIG is checked - Setting property \"sigLit\" to 1 and \"sigUnlit\" to 0.");
                    props.setProperty("sigLit","1");
                    props.setProperty("sigUnlit","0");
                    log.printExclog("Adding 1 to litInds.");
                    litInds++;
                } else {
                    log.printExclog("Lit SIG is unchecked - Setting property \"sigLit\" to 0 and \"sigUnlit\" to 1.");
                    props.setProperty("sigLit","0");
                    props.setProperty("sigUnlit","1");
                    log.printExclog("Adding 1 to unlitInds.");
                    unlitInds++;
                }
                log.printExclog("Adding 1 to inds.");
                inds++;
            } else {
                log.printExclog("SIG is unchecked - Setting all related properties to 0.");
                props.setProperty("sig","0");
                props.setProperty("sigLit","0");
                props.setProperty("sigUnlit","0");
                sigLitCB.setChecked(false);
            }
            sndCB = sv.findViewById(R.id.sndCB);
            sndLitCB = sv.findViewById(R.id.sndLitCB);
            if (sndCB.isChecked()) {
                log.printExclog("SND is checked - Setting property \"snd\" to 1.");
                props.setProperty("snd","1");
                if (sndLitCB.isChecked()) {
                    log.printExclog("Lit SND is checked - Setting property \"sndLit\" to 1 and \"sndUnlit\" to 0.");
                    props.setProperty("sndLit","1");
                    props.setProperty("sndUnlit","0");
                    log.printExclog("Adding 1 to litInds.");
                    litInds++;
                } else {
                    log.printExclog("Lit SND is unchecked - Setting property \"sndLit\" to 0 and \"sndUnlit\" to 1.");
                    props.setProperty("sndLit","0");
                    props.setProperty("sndUnlit","1");
                    log.printExclog("Adding 1 to unlitInds.");
                    unlitInds++;
                }
                log.printExclog("Adding 1 to inds.");
                inds++;
            } else {
                log.printExclog("SND is unchecked - Setting all related properties to 0.");
                props.setProperty("snd","0");
                props.setProperty("sndLit","0");
                props.setProperty("sndUnlit","0");
                sndLitCB.setChecked(false);
            }
            trnCB = sv.findViewById(R.id.trnCB);
            trnLitCB = sv.findViewById(R.id.trnLitCB);
            if (trnCB.isChecked()) {
                log.printExclog("TRN is checked - Setting property \"trn\" to 1.");
                props.setProperty("trn","1");
                if (trnLitCB.isChecked()) {
                    log.printExclog("Lit TRN is checked - Setting property \"trnLit\" to 1 and \"trnUnlit\" to 0.");
                    props.setProperty("trnLit","1");
                    props.setProperty("trnUnlit","0");
                    log.printExclog("Adding 1 to litInds.");
                    litInds++;
                } else {
                    log.printExclog("Lit TRN is unchecked - Setting property \"trnLit\" to 0 and \"trnUnlit\" to 1.");
                    props.setProperty("trnLit","0");
                    props.setProperty("trnUnlit","1");
                    log.printExclog("Adding 1 to unlitInds.");
                    unlitInds++;
                }
                log.printExclog("Adding 1 to inds.");
                inds++;
            } else {
                log.printExclog("TRN is unchecked - Setting all related properties to 0.");
                props.setProperty("trn","0");
                props.setProperty("trnLit","0");
                props.setProperty("trnUnlit","0");
                trnLitCB.setChecked(false);
            }
            log.printExclog("Ind value: " + inds);
            props.setProperty("totalInds",String.valueOf(inds));
            modIndTxt = sv.findViewById(R.id.modIndTXT);
            if (modIndTxt.getText().toString().equals("")) {
                log.printExclog("Mod Indicator text is empty, setting to 0.");
                modIndTxt.setText("0");
            } else log.printExclog("Mod indicator value: " + modIndTxt.getText().toString());
            log.printExclog("Ind value (+ mods): " + (inds + Integer.parseInt(modIndTxt.getText().toString())));
            props.setProperty("totalIndsPlusMods",String.valueOf(inds+Integer.parseInt(modIndTxt.getText().toString())));
            log.printExclog("Lit Inds value: " + litInds);
            props.setProperty("totalIndsLit",String.valueOf(litInds));
            log.printExclog("Unlit Inds value: " + unlitInds);
            props.setProperty("totalIndsUnlit",String.valueOf(unlitInds));
            // batteries
            aaTxt = sv.findViewById(R.id.aaTXT);
            dTxt = sv.findViewById(R.id.dTXT);
            if (aaTxt.getText().toString().equals("")) {
                log.printExclog("AA text is empty, setting to 0.");
                aaTxt.setText("0");
            } else log.printExclog("AA value: " + aaTxt.getText().toString());
            props.setProperty("batteriesAA",aaTxt.getText().toString());
            if (dTxt.getText().toString().equals("")) {
                log.printExclog("D text is empty, setting to 0.");
                dTxt.setText("0");
            } else log.printExclog("D value: " + dTxt.getText().toString());
            props.setProperty("batteriesD",dTxt.getText().toString());
            log.printExclog("Total Batteries value: " + Integer.parseInt(aaTxt.getText().toString()) + Integer.parseInt(dTxt.getText().toString()));
            props.setProperty("batteriesTotal",Integer.toString(Integer.parseInt(aaTxt.getText().toString()) + Integer.parseInt(dTxt.getText().toString())));
            log.printExclog("AA Battery Holders: " + Integer.parseInt(aaTxt.getText().toString()) / 2);
            log.printExclog("D Battery Holders: " + Integer.parseInt(dTxt.getText().toString()));
            log.printExclog("Battery Holders value: " + (Integer.parseInt(aaTxt.getText().toString()) / 2) + Integer.parseInt(dTxt.getText().toString()));
            props.setProperty("batteryHolders",Integer.toString((Integer.parseInt(aaTxt.getText().toString()) / 2) + Integer.parseInt(dTxt.getText().toString())));
            // ports
            dvidTxt = sv.findViewById(R.id.dvidTXT);
            if (dvidTxt.getText().toString().equals("")) {
                log.printExclog("DVI-D text is empty, setting to 0.");
                dvidTxt.setText("0");
            } else log.printExclog("DVI-D Quantity value: " + dvidTxt.getText().toString());
            String dvidQuantity = dvidTxt.getText().toString();
            props.setProperty("dvidQuantity",dvidQuantity);
            parallelTxt = sv.findViewById(R.id.parallelTXT);
            if (parallelTxt.getText().toString().equals("")) {
                log.printExclog("Parallel text is empty, setting to 0.");
                parallelTxt.setText("0");
            } else log.printExclog("Parallel Quantity value: " + parallelTxt.getText().toString());
            String parallelQuantity = parallelTxt.getText().toString();
            props.setProperty("parallelQuantity",parallelQuantity);
            ps2Txt = sv.findViewById(R.id.ps2TXT);
            if (ps2Txt.getText().toString().equals("")) {
                log.printExclog("PS/2 text is empty, setting to 0.");
                ps2Txt.setText("0");
            } else log.printExclog("PS/2 Quantity value: " + ps2Txt.getText().toString());
            String ps2Quantity = ps2Txt.getText().toString();
            props.setProperty("ps2Quantity",ps2Quantity);
            rj45Txt = sv.findViewById(R.id.rj45TXT);
            if (rj45Txt.getText().toString().equals("")) {
                log.printExclog("RJ-45 text is empty, setting to 0.");
                rj45Txt.setText("0");
            } else log.printExclog("RJ-45 Quantity value: " + rj45Txt.getText().toString());
            String rj45Quantity = rj45Txt.getText().toString();
            props.setProperty("rj45Quantity",rj45Quantity);
            serialTxt = sv.findViewById(R.id.serialTXT);
            if (serialTxt.getText().toString().equals("")) {
                log.printExclog("Serial text is empty, setting to 0.");
                serialTxt.setText("0");
            } else log.printExclog("Serial Quantity value: " + serialTxt.getText().toString());
            String serialQuantity = serialTxt.getText().toString();
            props.setProperty("serialQuantity",serialQuantity);
            stereoRCATxt = sv.findViewById(R.id.stereoRCATXT);
            if (stereoRCATxt.getText().toString().equals("")) {
                log.printExclog("Stereo RCA text is empty, setting to 0.");
                stereoRCATxt.setText("0");
            } else log.printExclog("Stereo RCA Quantity value: " + stereoRCATxt.getText().toString());
            String stereoRCAQuantity = stereoRCATxt.getText().toString();
            props.setProperty("stereoRCAQuantity",stereoRCAQuantity);
            int ports = 0;
            ports += Integer.parseInt(dvidQuantity) + Integer.parseInt(parallelQuantity) +
                    Integer.parseInt(ps2Quantity) + Integer.parseInt(rj45Quantity) +
                    Integer.parseInt(serialQuantity) + Integer.parseInt(stereoRCAQuantity);
            log.printExclog("Total Ports value: " + ports);
            props.setProperty("totalPorts",String.valueOf(ports));
            if (modPortTxt.getText().toString().equals("")) {
                log.printExclog("Mod Port text is empty, setting to 0.");
                modPortTxt.setText("0");
            } else log.printExclog("Mod Port value: " + modPortTxt.getText().toString());
            ports += Integer.parseInt(modPortTxt.getText().toString());
            log.printExclog("Total Ports (+ mods) value: " + ports);
            props.setProperty("totalPortsPlusMods",String.valueOf(ports));
            int portTypes = 0;
            if (Integer.parseInt(dvidQuantity) > 0) {
                log.printExclog("DVI-D Quantity > 0, DVI-D exist value set to 1.");
                props.setProperty("dvid","1");
                portTypes++;
            }
            else {
                log.printExclog("DVI-D Quantity = 0, DVI-D exist value set to 0.");
                props.setProperty("dvid","0");
            }
            if (Integer.parseInt(parallelQuantity) > 0) {
                log.printExclog("Parallel Quantity > 0, Parallel exist value set to 1.");
                props.setProperty("parallel","1");
                portTypes++;
            }
            else {
                log.printExclog("Parallel Quantity = 0, Parallel exist value set to 0.");
                props.setProperty("parallel","0");
            }
            if (Integer.parseInt(ps2Quantity) > 0) {
                log.printExclog("PS/2 Quantity > 0, PS/2 exist value set to 1.");
                props.setProperty("ps2","1");
                portTypes++;
            }
            else {
                log.printExclog("PS/2 Quantity = 0, PS/2 exist value set to 0.");
                props.setProperty("ps2","0");
            }
            if (Integer.parseInt(rj45Quantity) > 0) {
                log.printExclog("RJ-45 Quantity > 0, RJ-45 exist value set to 1.");
                props.setProperty("rj45","1");
                portTypes++;
            }
            else {
                log.printExclog("RJ-45 Quantity = 0, RJ-45 exist value set to 0.");
                props.setProperty("rj45","0");
            }
            if (Integer.parseInt(serialQuantity) > 0) {
                log.printExclog("Serial Quantity > 0, Serial exist value set to 1.");
                props.setProperty("serial", "1");
                portTypes++;
            }
            else {
                log.printExclog("Serial Quantity = 0, Serial exist value set to 0.");
                props.setProperty("serial","0");
            }
            if (Integer.parseInt(stereoRCAQuantity) > 0) {
                log.printExclog("Stereo RCA Quantity > 0, Stereo RCA exist value set to 1.");
                props.setProperty("stereoRCA","1");
                portTypes++;
            }
            else {
                log.printExclog("Stereo RCA Quantity = 0, Stereo RCA exist value set to 0.");
                props.setProperty("stereoRCA","0");
            }
            log.printExclog("Total Port Type value: " + portTypes);
            props.setProperty("totalPortTypes",String.valueOf(portTypes));
            // SN
            snTxt = sv.findViewById(R.id.snTXT);
            sn = snTxt.getText().toString();
            log.printExclog("SN Text: " + sn);
            String[] snTempArr = sn.split("");
            for (int i = 0; i < snTempArr.length; i++) {
                log.printExclog("Uncleaned SN Arr (Index " + i + "): " + snTempArr[i]);
            }
            String[] snArr = string.removeLast(string.moveOnceLeft(sn.split("")));
            for (int i = 0; i < snArr.length; i++) {
                log.printExclog("Cleaned SN Arr (Index " + i + "): " + snArr[i]);
            }
            try {
                log.printExclog("SN 1 value: " + snArr[0]);
                props.setProperty("sn1",snArr[0]);
            } catch (ArrayIndexOutOfBoundsException ex) {
                log.printExclog("SN 1 value empty. Setting to default [B]");
                props.setProperty("sn1","B");
            }
            try {
                log.printExclog("SN 2 value: " + snArr[1]);
                props.setProperty("sn2",snArr[1]);
            } catch (ArrayIndexOutOfBoundsException ex) {
                log.printExclog("SN 2 value empty. Setting to default [B]");
                props.setProperty("sn2","B");
            }
            try {
                log.printExclog("SN 3 value: " + snArr[2]);
                props.setProperty("sn3",snArr[2]);
            } catch (ArrayIndexOutOfBoundsException ex) {
                log.printExclog("SN 3 value empty. Setting to default [B]");
                props.setProperty("sn3","B");
            }
            try {
                log.printExclog("SN 4 value: " + snArr[3]);
                props.setProperty("sn4",snArr[3]);
            } catch (ArrayIndexOutOfBoundsException ex) {
                log.printExclog("SN 4 value empty. Setting to default [0]");
                props.setProperty("sn4","0");
            }
            try {
                log.printExclog("SN 5 value: " + snArr[4]);
                props.setProperty("sn5",snArr[4]);
            } catch (ArrayIndexOutOfBoundsException ex) {
                log.printExclog("SN 5 value empty. Setting to default [0]");
                props.setProperty("sn5","0");
            }
            try {
                log.printExclog("SN 6 value: " + snArr[5]);
                props.setProperty("sn6",snArr[5]);
            } catch (ArrayIndexOutOfBoundsException ex) {
                log.printExclog("SN 6 value empty. Setting to default [0]");
                props.setProperty("sn6","0");
            }
            String vowel = "f";
            for (int i = 0; i < snArr.length; i++) {
                String s = snArr[i];
                if (string.isVowel(s)) {
                    log.printExclog("SN vowel check [#" + i + "] (" + s + ") = true");
                    vowel = "t";
                } else log.printExclog("SN vowel check [#" + i + "] (" + s + ") = false");
            }
            log.printExclog("SN Vowel value: " + vowel);
            props.setProperty("snVowel",vowel);
            log.printExclog("SN First Digit value: " + string.firstInt(sn));
            props.setProperty("snFirstDig",String.valueOf(string.firstInt(sn)));
            log.printExclog("SN Last Digit value: " + string.lastInt(sn));
            props.setProperty("snLastDig",String.valueOf(string.lastInt(sn)));
            log.printExclog("SN Total Digits value: " + string.totalDigits(sn));
            props.setProperty("snTotalDigs",String.valueOf(string.totalDigits(sn)));
            log.printExclog("SN Total Letters value: " + string.totalLetters(sn));
            props.setProperty("snTotalLets",String.valueOf(string.totalLetters(sn)));
            // Modules
            moduleTxt = sv.findViewById(R.id.moduleTXT);
            if (moduleTxt.getText().toString().equals("")) {
                log.printExclog("Module text empty, setting to 0.");
                moduleTxt.setText("0");
            } else log.printExclog("Module value: " + moduleTxt.getText().toString());
            props.setProperty("modules",moduleTxt.getText().toString());
            // Plates
            plateTxt = sv.findViewById(R.id.plateTXT);
            if (plateTxt.getText().toString().equals("")) {
                log.printExclog("Port Plate text empty, setting to 0.");
                plateTxt.setText("0");
            } else log.printExclog("Port Plate value: " + plateTxt.getText().toString());
            props.setProperty("plates",plateTxt.getText().toString());
            // Mod Indicators
            props.setProperty("modInd",modIndTxt.getText().toString());
            // Mod Ports
            props.setProperty("modPort",modPortTxt.getText().toString());
            try {
                FileWriter writer = new FileWriter(Props.configFile);
                props.store(writer,"settings");
                Toast.makeText(getActivity(),"Saved!",Toast.LENGTH_SHORT).show();
                endTime = System.nanoTime();
                calcTime = endTime - startTime;
                log.print("Bomb settings done saving. Took " + (calcTime / 1000000) + " ms.");
                log.printExclog("Start time: " + startTime);
                log.printExclog("End time: " + endTime);
                log.printExclog("Exact calculated time: " + calcTime);
            } catch (Exception ex) {
                Toast.makeText(getActivity(),"Failed to save! Check log for error details.",Toast.LENGTH_LONG).show();
                log.print("Exception occurred when trying to save! (Probably an IO Exception) printing stack trace...");
                log.printStackTrace(ex);
            }
        });
        // clear button
        currNormalBtn = sv.findViewById(R.id.clearBtn);
        currNormalBtn.setOnClickListener((View v) -> {
            log.printExclog("Click listened: Clear Button");
            // indicators
            bobCB.setChecked(false);
            bobLitCB.setChecked(false);
            carCB.setChecked(false);
            carLitCB.setChecked(false);
            clrCB.setChecked(false);
            clrLitCB.setChecked(false);
            frkCB.setChecked(false);
            frkLitCB.setChecked(false);
            frqCB.setChecked(false);
            frqLitCB.setChecked(false);
            indCB.setChecked(false);
            indLitCB.setChecked(false);
            msaCB.setChecked(false);
            msaLitCB.setChecked(false);
            nsaCB.setChecked(false);
            nsaLitCB.setChecked(false);
            sigCB.setChecked(false);
            sigLitCB.setChecked(false);
            sndCB.setChecked(false);
            sndLitCB.setChecked(false);
            trnCB.setChecked(false);
            trnLitCB.setChecked(false);
            // batteries
            aaTxt.setText("");
            dTxt.setText("");
            // ports
            dvidTxt.setText("");
            parallelTxt.setText("");
            ps2Txt.setText("");
            rj45Txt.setText("");
            serialTxt.setText("");
            stereoRCATxt.setText("");
            // other stuff
            plateTxt.setText("");
            modIndTxt.setText("");
            modPortTxt.setText("");
            moduleTxt.setText("");
            serialTxt.setText("");
            snTxt.setText("");
            Toast.makeText(getActivity(),"Cleared!",Toast.LENGTH_SHORT).show();
        });
        // dark theme
        SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(getContext());
        if (sharedPrefs.getBoolean("theme",false)) {
            log.printExclog("Detected using Dark Theme. Setting all icons to white tints...");
            int[][] state = new int[][]{
                    new int[]{-android.R.attr.state_enabled},
                    new int[]{android.R.attr.state_enabled},
                    new int[]{-android.R.attr.state_checked},
                    new int[]{android.R.attr.state_pressed}
            };
            int[] color = new int[]{
                    Color.WHITE,
                    Color.WHITE,
                    Color.WHITE,
                    Color.WHITE
            };
            ColorStateList cs = new ColorStateList(state, color);
            currBtn = sv.findViewById(R.id.aaAddBTN);
            currBtn.setImageTintList(cs);
            currBtn = sv.findViewById(R.id.aaRmvBTN);
            currBtn.setImageTintList(cs);
            currBtn = sv.findViewById(R.id.dAddBTN);
            currBtn.setImageTintList(cs);
            currBtn = sv.findViewById(R.id.dRmvBTN);
            currBtn.setImageTintList(cs);
            currBtn = sv.findViewById(R.id.dvidAddBTN);
            currBtn.setImageTintList(cs);
            currBtn = sv.findViewById(R.id.dvidRmvBTN);
            currBtn.setImageTintList(cs);
            currBtn = sv.findViewById(R.id.parallelAddBTN);
            currBtn.setImageTintList(cs);
            currBtn = sv.findViewById(R.id.parallelRmvBTN);
            currBtn.setImageTintList(cs);
            currBtn = sv.findViewById(R.id.ps2AddBTN);
            currBtn.setImageTintList(cs);
            currBtn = sv.findViewById(R.id.ps2RmvBTN);
            currBtn.setImageTintList(cs);
            currBtn = sv.findViewById(R.id.rj45AddBTN);
            currBtn.setImageTintList(cs);
            currBtn = sv.findViewById(R.id.rj45RmvBTN);
            currBtn.setImageTintList(cs);
            currBtn = sv.findViewById(R.id.serialAddBTN);
            currBtn.setImageTintList(cs);
            currBtn = sv.findViewById(R.id.serialRmvBTN);
            currBtn.setImageTintList(cs);
            currBtn = sv.findViewById(R.id.stereoRCAAddBTN);
            currBtn.setImageTintList(cs);
            currBtn = sv.findViewById(R.id.stereoRCARmvBTN);
            currBtn.setImageTintList(cs);
            currBtn = sv.findViewById(R.id.plateAddBTN);
            currBtn.setImageTintList(cs);
            currBtn = sv.findViewById(R.id.plateRmvBTN);
            currBtn.setImageTintList(cs);
            currBtn = sv.findViewById(R.id.modIndAddBTN);
            currBtn.setImageTintList(cs);
            currBtn = sv.findViewById(R.id.modIndRmvBTN);
            currBtn.setImageTintList(cs);
            currBtn = sv.findViewById(R.id.modPortAddBTN);
            currBtn.setImageTintList(cs);
            currBtn = sv.findViewById(R.id.modPortRmvBTN);
            currBtn.setImageTintList(cs);
            currBtn = sv.findViewById(R.id.moduleAddBTN);
            currBtn.setImageTintList(cs);
            currBtn = sv.findViewById(R.id.moduleRmvBTN);
            currBtn.setImageTintList(cs);
        }
        endTime = System.nanoTime();
        calcTime = endTime - startTime;
        log.print("Bomb Settings done loading. Took " + (calcTime / 1000000)+ " ms.");
        log.printExclog("Start time: " + startTime);
        log.printExclog("End time: " + endTime);
        log.printExclog("Exact calculated time: " + calcTime);
        return sv;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Bomb Settings");
    }

    // Adding/Removing buttons
    private String add(EditText text, boolean isEven) {
        // convert
        int curr = convert(text);
        // check need for even
        log.printExclog("Even Bool: " + isEven);
        if (isEven) {
            // if it's an odd number, add 1 to make it even
            if (curr % 2 == 1) {
                curr++;
                log.printExclog("Int is odd, added 1 to make it even");
            }
            // if it's even, add 2
            else {
                curr += 2;
                log.printExclog("Int is even, added 2.");
            }
        } else {
            curr++;
        }
        // return string
        log.printExclog("Final int: " + curr);
        return String.valueOf(curr);
    }
    private String remove(EditText text, boolean isEven) {
        // convert
        int curr = convert(text);
        // if it's 0, then don't remove
        if (curr != 0) {
            // check need for even
            log.printExclog("Even Bool: " + isEven);
            if (isEven) {
                // if it's an odd number, remove 1 to make it even
                if (curr % 2 == 1) {
                    log.printExclog("Int is odd, removed 1 to make it even");
                    curr--;
                }
                // if it's even, remove 2
                else {
                    log.printExclog("Int is even, removed 2");
                    curr -= 2;
                }
            } else curr--;
        }
        else log.printExclog("Int is 0, ignoring remove request...");
        // return the converted string
        log.printExclog("Final int: " + curr);
        return String.valueOf(curr);
    }
    private int convert(EditText text) {
        log.printExclog("Converting Text -> String -> Int");
        // text -> string
        String curr = text.getText().toString();
        log.printExclog("Converted string: " + curr);
        // if it's empty/has non-digits, use 0 instead
        int currInt = 0;
        // otherwise just convert
        if (!curr.equals("") && android.text.TextUtils.isDigitsOnly(curr)) currInt = Integer.parseInt(curr);
        log.printExclog("Converted int: " + currInt);
        // return int
        return currInt;
    }
}
