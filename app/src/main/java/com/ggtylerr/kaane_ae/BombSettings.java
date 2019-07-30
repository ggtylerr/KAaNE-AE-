package com.ggtylerr.kaane_ae;

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

import com.ggtylerr.kaane_ae.util.Props;
import com.ggtylerr.kaane_ae.util.string;

import java.io.FileWriter;
import java.util.Properties;

public class BombSettings extends Fragment {
    private static Properties props;
    private static String sn;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ScrollView sv = (ScrollView) inflater.inflate(R.layout.fragment_bomb_settings, container, false);
        // Property Handling
        props = new Properties();
        props = Props.load(props);
        // Define widgets/stuff
        CheckBox bobCB = sv.findViewById(R.id.bobCB);
        CheckBox carCB = sv.findViewById(R.id.carCB);
        CheckBox clrCB = sv.findViewById(R.id.clrCB);
        CheckBox frkCB = sv.findViewById(R.id.frkCB);
        CheckBox frqCB = sv.findViewById(R.id.frqCB);
        CheckBox indCB = sv.findViewById(R.id.indCB);
        CheckBox msaCB = sv.findViewById(R.id.msaCB);
        CheckBox nsaCB = sv.findViewById(R.id.nsaCB);
        CheckBox sigCB = sv.findViewById(R.id.sigCB);
        CheckBox sndCB = sv.findViewById(R.id.sndCB);
        CheckBox trnCB = sv.findViewById(R.id.trnCB);
        CheckBox bobLitCB = sv.findViewById(R.id.bobLitCB);
        CheckBox carLitCB = sv.findViewById(R.id.carLitCB);
        CheckBox clrLitCB = sv.findViewById(R.id.clrLitCB);
        CheckBox frkLitCB = sv.findViewById(R.id.frkLitCB);
        CheckBox frqLitCB = sv.findViewById(R.id.frqLitCB);
        CheckBox indLitCB = sv.findViewById(R.id.indLitCB);
        CheckBox msaLitCB = sv.findViewById(R.id.msaLitCB);
        CheckBox nsaLitCB = sv.findViewById(R.id.nsaLitCB);
        CheckBox sigLitCB = sv.findViewById(R.id.sigLitCB);
        CheckBox sndLitCB = sv.findViewById(R.id.sndLitCB);
        CheckBox trnLitCB = sv.findViewById(R.id.trnLitCB);
        EditText aaTxt = sv.findViewById(R.id.aaTXT);
        EditText dTxt = sv.findViewById(R.id.dTXT);
        EditText dvidTxt = sv.findViewById(R.id.dvidTXT);
        EditText parallelTxt = sv.findViewById(R.id.parallelTXT);
        EditText ps2Txt = sv.findViewById(R.id.ps2TXT);
        EditText rj45Txt = sv.findViewById(R.id.rj45TXT);
        EditText serialTxt = sv.findViewById(R.id.serialTXT);
        EditText stereoRCATxt = sv.findViewById(R.id.stereoRCATXT);
        EditText snTxt = sv.findViewById(R.id.snTXT);
        EditText moduleTxt = sv.findViewById(R.id.moduleTXT);
        EditText plateTxt = sv.findViewById(R.id.plateTXT);
        EditText modIndTxt = sv.findViewById(R.id.modIndTXT);
        EditText modPortTxt = sv.findViewById(R.id.modPortTXT);
        // Mirror Settings to Properties
        if (Integer.parseInt(props.getProperty("bob")) == 1) bobCB.setSelected(true);
        if (Integer.parseInt(props.getProperty("bobLit")) == 1) bobLitCB.setSelected(true);
        if (Integer.parseInt(props.getProperty("car")) == 1) carCB.setSelected(true);
        if (Integer.parseInt(props.getProperty("carLit")) == 1) carLitCB.setSelected(true);
        if (Integer.parseInt(props.getProperty("clr")) == 1) clrCB.setSelected(true);
        if (Integer.parseInt(props.getProperty("clrLit")) == 1) clrLitCB.setSelected(true);
        if (Integer.parseInt(props.getProperty("frk")) == 1) frkCB.setSelected(true);
        if (Integer.parseInt(props.getProperty("frkLit")) == 1) frkLitCB.setSelected(true);
        if (Integer.parseInt(props.getProperty("frq")) == 1) frqCB.setSelected(true);
        if (Integer.parseInt(props.getProperty("frqLit")) == 1) frqLitCB.setSelected(true);
        if (Integer.parseInt(props.getProperty("ind")) == 1) indCB.setSelected(true);
        if (Integer.parseInt(props.getProperty("indLit")) == 1) indLitCB.setSelected(true);
        if (Integer.parseInt(props.getProperty("msa")) == 1) msaCB.setSelected(true);
        if (Integer.parseInt(props.getProperty("msaLit")) == 1) msaLitCB.setSelected(true);
        if (Integer.parseInt(props.getProperty("nsa")) == 1) nsaCB.setSelected(true);
        if (Integer.parseInt(props.getProperty("nsaLit")) == 1) nsaLitCB.setSelected(true);
        if (Integer.parseInt(props.getProperty("sig")) == 1) sigCB.setSelected(true);
        if (Integer.parseInt(props.getProperty("sigLit")) == 1) sigLitCB.setSelected(true);
        if (Integer.parseInt(props.getProperty("snd")) == 1) sndCB.setSelected(true);
        if (Integer.parseInt(props.getProperty("sndLit")) == 1) sndLitCB.setSelected(true);
        if (Integer.parseInt(props.getProperty("trn")) == 1) trnCB.setSelected(true);
        if (Integer.parseInt(props.getProperty("trnLit")) == 1) trnLitCB.setSelected(true);
        aaTxt.setText(props.getProperty("batteriesAA"));
        dTxt.setText(props.getProperty("batteriesD"));
        dvidTxt.setText(props.getProperty("dvidQuantity"));
        parallelTxt.setText(props.getProperty("parallelQuantity"));
        ps2Txt.setText(props.getProperty("ps2Quantity"));
        rj45Txt.setText(props.getProperty("rj45Quantity"));
        serialTxt.setText(props.getProperty("serialQuantity"));
        stereoRCATxt.setText(props.getProperty("stereoRCAQuantity"));
        sn = props.getProperty("sn1") + props.getProperty("sn2") + props.getProperty("sn3") +
                props.getProperty("sn4") + props.getProperty("sn5") + props.getProperty("sn6");
        snTxt.setText(sn);
        moduleTxt.setText(props.getProperty("modules"));
        plateTxt.setText(props.getProperty("plates"));
        modIndTxt.setText(props.getProperty("modInd"));
        modPortTxt.setText(props.getProperty("modPort"));
        // Add/Remove Buttons
        // AA Add
        ImageButton currBtn = sv.findViewById(R.id.aaAddBTN);
        currBtn.setOnClickListener((View v) -> aaTxt.setText(add(aaTxt,true)));
        // AA Remove
        currBtn = sv.findViewById(R.id.aaRmvBTN);
        currBtn.setOnClickListener((View v) -> aaTxt.setText(remove(aaTxt,true)));
        // D Add
        currBtn = sv.findViewById(R.id.dAddBTN);
        currBtn.setOnClickListener((View v) -> dTxt.setText(add(dTxt,false)));
        // D Remove
        currBtn = sv.findViewById(R.id.dRmvBTN);
        currBtn.setOnClickListener((View v) -> dTxt.setText(remove(dTxt,false)));
        // DVI-D Add
        currBtn = sv.findViewById(R.id.dvidAddBTN);
        currBtn.setOnClickListener((View v) -> dvidTxt.setText(add(dvidTxt,false)));
        // DVI-D Remove
        currBtn = sv.findViewById(R.id.dvidRmvBTN);
        currBtn.setOnClickListener((View v) -> dvidTxt.setText(remove(dvidTxt,false)));
        // Parallel Add
        currBtn = sv.findViewById(R.id.parallelAddBTN);
        currBtn.setOnClickListener((View v) -> parallelTxt.setText(add(parallelTxt,false)));
        // Parallel Remove
        currBtn = sv.findViewById(R.id.parallelRmvBTN);
        currBtn.setOnClickListener((View v) -> parallelTxt.setText(remove(parallelTxt,false)));
        // PS/2 Add
        currBtn = sv.findViewById(R.id.ps2AddBTN);
        currBtn.setOnClickListener((View v) -> ps2Txt.setText(add(ps2Txt,false)));
        // PS/2 Remove
        currBtn = sv.findViewById(R.id.ps2RmvBTN);
        currBtn.setOnClickListener((View v) -> ps2Txt.setText(remove(ps2Txt,false)));
        // RJ-45 Add
        currBtn = sv.findViewById(R.id.rj45AddBTN);
        currBtn.setOnClickListener((View v) -> rj45Txt.setText(add(rj45Txt,false)));
        // RJ-45 Remove
        currBtn = sv.findViewById(R.id.rj45RmvBTN);
        currBtn.setOnClickListener((View v) -> rj45Txt.setText(remove(rj45Txt,false)));
        // Serial Add
        currBtn = sv.findViewById(R.id.serialAddBTN);
        currBtn.setOnClickListener((View v) -> serialTxt.setText(add(serialTxt,false)));
        // Serial Remove
        currBtn = sv.findViewById(R.id.serialRmvBTN);
        currBtn.setOnClickListener((View v) -> serialTxt.setText(remove(serialTxt,false)));
        // Stereo RCA Add
        currBtn = sv.findViewById(R.id.stereoRCAAddBTN);
        currBtn.setOnClickListener((View v) -> stereoRCATxt.setText(add(stereoRCATxt,false)));
        // Stereo RCA Remove
        currBtn = sv.findViewById(R.id.stereoRCARmvBTN);
        currBtn.setOnClickListener((View v) -> stereoRCATxt.setText(remove(stereoRCATxt,false)));
        // Port Plate Add
        currBtn = sv.findViewById(R.id.plateAddBTN);
        currBtn.setOnClickListener((View v) -> plateTxt.setText(add(plateTxt,false)));
        // Port Plate Remove
        currBtn = sv.findViewById(R.id.plateRmvBTN);
        currBtn.setOnClickListener((View v) -> plateTxt.setText(remove(plateTxt,false)));
        // Mod Indicator Add
        currBtn = sv.findViewById(R.id.modIndAddBTN);
        currBtn.setOnClickListener((View v) -> modIndTxt.setText(add(modIndTxt,false)));
        // Mod Indicator Remove
        currBtn = sv.findViewById(R.id.modIndRmvBTN);
        currBtn.setOnClickListener((View v) -> modIndTxt.setText(remove(modIndTxt,false)));
        // Mod Port Add
        currBtn = sv.findViewById(R.id.modPortAddBTN);
        currBtn.setOnClickListener((View v) -> modPortTxt.setText(add(modPortTxt,false)));
        // Mod Port Remove
        currBtn = sv.findViewById(R.id.modPortRmvBTN);
        currBtn.setOnClickListener((View v) -> modPortTxt.setText(remove(modPortTxt,false)));
        // Modules Add
        currBtn = sv.findViewById(R.id.moduleAddBTN);
        currBtn.setOnClickListener((View v) -> moduleTxt.setText(add(moduleTxt,false)));
        // Modules Remove
        currBtn = sv.findViewById(R.id.moduleRmvBTN);
        currBtn.setOnClickListener((View v) -> moduleTxt.setText(remove(moduleTxt,false)));
        // Saving
        AppCompatButton currNormalBtn = sv.findViewById(R.id.saveBtn);
        currNormalBtn.setOnClickListener((View v) -> {
            // indicators
            int inds = 0;
            int litInds = 0;
            int unlitInds = 0;
            if (bobCB.isSelected()) {
                props.setProperty("bob","1");
                if (bobLitCB.isSelected()) {
                    props.setProperty("bobLit","1");
                    props.setProperty("bobUnlit","0");
                    litInds++;
                } else {
                    props.setProperty("bobLit","0");
                    props.setProperty("bobUnlit","1");
                    unlitInds++;
                }
                inds++;
            } else {
                props.setProperty("bob","0");
                props.setProperty("bobLit","0");
                props.setProperty("bobUnlit","0");
                bobLitCB.setSelected(false);
            }
            if (carCB.isSelected()) {
                props.setProperty("car","1");
                if (carLitCB.isSelected()) {
                    props.setProperty("carLit","1");
                    props.setProperty("carUnlit","0");
                    litInds++;
                } else {
                    props.setProperty("carLit","0");
                    props.setProperty("carUnlit","1");
                    unlitInds++;
                }
                inds++;
            } else {
                props.setProperty("car","0");
                props.setProperty("carLit","0");
                props.setProperty("carUnlit","0");
                carLitCB.setSelected(false);
            }
            if (clrCB.isSelected()) {
                props.setProperty("clr","1");
                if (clrLitCB.isSelected()) {
                    props.setProperty("clrLit","1");
                    props.setProperty("clrUnlit","0");
                    litInds++;
                } else {
                    props.setProperty("clrLit","0");
                    props.setProperty("clrUnlit","1");
                    unlitInds++;
                }
                inds++;
            } else {
                props.setProperty("clr","0");
                props.setProperty("clrLit","0");
                props.setProperty("clrUnlit","0");
                clrLitCB.setSelected(false);
            }
            if (frkCB.isSelected()) {
                props.setProperty("frk","1");
                if (frkLitCB.isSelected()) {
                    props.setProperty("frkLit","1");
                    props.setProperty("frkUnlit","0");
                    litInds++;
                } else {
                    props.setProperty("frkLit","0");
                    props.setProperty("frkUnlit","1");
                    unlitInds++;
                }
                inds++;
            } else {
                props.setProperty("frk","0");
                props.setProperty("frkLit","0");
                props.setProperty("frkUnlit","0");
                frkLitCB.setSelected(false);
            }
            if (frqCB.isSelected()) {
                props.setProperty("frq","1");
                if (frqLitCB.isSelected()) {
                    props.setProperty("frqLit","1");
                    props.setProperty("frqUnlit","0");
                    litInds++;
                } else {
                    props.setProperty("frqLit","0");
                    props.setProperty("frqUnlit","1");
                    unlitInds++;
                }
                inds++;
            } else {
                props.setProperty("frq","0");
                props.setProperty("frqLit","0");
                props.setProperty("frqUnlit","0");
                frqLitCB.setSelected(false);
            }
            if (indCB.isSelected()) {
                props.setProperty("ind","1");
                if (indLitCB.isSelected()) {
                    props.setProperty("indLit","1");
                    props.setProperty("indUnlit","0");
                    litInds++;
                } else {
                    props.setProperty("indLit","0");
                    props.setProperty("indUnlit","1");
                    unlitInds++;
                }
                inds++;
            } else {
                props.setProperty("ind","0");
                props.setProperty("indLit","0");
                props.setProperty("indUnlit","0");
                indLitCB.setSelected(false);
            }
            if (msaCB.isSelected()) {
                props.setProperty("msa","1");
                if (msaLitCB.isSelected()) {
                    props.setProperty("msaLit","1");
                    props.setProperty("msaUnlit","0");
                    litInds++;
                } else {
                    props.setProperty("msaLit","0");
                    props.setProperty("msaUnlit","1");
                    unlitInds++;
                }
                inds++;
            } else {
                props.setProperty("msa","0");
                props.setProperty("msaLit","0");
                props.setProperty("msaUnlit","0");
                msaLitCB.setSelected(false);
            }
            if (nsaCB.isSelected()) {
                props.setProperty("nsa","1");
                if (nsaLitCB.isSelected()) {
                    props.setProperty("nsaLit","1");
                    props.setProperty("nsaUnlit","0");
                    litInds++;
                } else {
                    props.setProperty("nsaLit","0");
                    props.setProperty("nsaUnlit","1");
                    unlitInds++;
                }
                inds++;
            } else {
                props.setProperty("nsa","0");
                props.setProperty("nsaLit","0");
                props.setProperty("nsaUnlit","0");
                nsaLitCB.setSelected(false);
            }
            if (sigCB.isSelected()) {
                props.setProperty("sig","1");
                if (sigLitCB.isSelected()) {
                    props.setProperty("sigLit","1");
                    props.setProperty("sigUnlit","0");
                    litInds++;
                } else {
                    props.setProperty("sigLit","0");
                    props.setProperty("sigUnlit","1");
                    unlitInds++;
                }
                inds++;
            } else {
                props.setProperty("sig","0");
                props.setProperty("sigLit","0");
                props.setProperty("sigUnlit","0");
                sigLitCB.setSelected(false);
            }
            if (sndCB.isSelected()) {
                props.setProperty("snd","1");
                if (sndLitCB.isSelected()) {
                    props.setProperty("sndLit","1");
                    props.setProperty("sndUnlit","0");
                    litInds++;
                } else {
                    props.setProperty("sndLit","0");
                    props.setProperty("sndUnlit","1");
                    unlitInds++;
                }
                inds++;
            } else {
                props.setProperty("snd","0");
                props.setProperty("sndLit","0");
                props.setProperty("sndUnlit","0");
                sndLitCB.setSelected(false);
            }
            if (trnCB.isSelected()) {
                props.setProperty("trn","1");
                if (trnLitCB.isSelected()) {
                    props.setProperty("trnLit","1");
                    props.setProperty("trnUnlit","0");
                    litInds++;
                } else {
                    props.setProperty("trnLit","0");
                    props.setProperty("trnUnlit","1");
                    unlitInds++;
                }
                inds++;
            } else {
                props.setProperty("trn","0");
                props.setProperty("trnLit","0");
                props.setProperty("trnUnlit","0");
                trnLitCB.setSelected(false);
            }
            if (modIndTxt.getText().toString().equals("")) modIndTxt.setText("0");
            props.setProperty("totalInds",String.valueOf(inds));
            props.setProperty("totalIndsPlusMods",String.valueOf(inds+Integer.parseInt(modIndTxt.getText().toString())));
            props.setProperty("totalIndsLit",String.valueOf(litInds));
            props.setProperty("totalIndsUnlit",String.valueOf(unlitInds));
            // batteries
            if (aaTxt.getText().toString().equals("")) aaTxt.setText("0");
            if (dTxt.getText().toString().equals("")) dTxt.setText("0");
            props.setProperty("batteriesTotal",Integer.toString(Integer.parseInt(aaTxt.getText().toString()) + Integer.parseInt(dTxt.getText().toString())));
            props.setProperty("batteryHolders",Integer.toString((Integer.parseInt(aaTxt.getText().toString()) / 2) + Integer.parseInt(dTxt.getText().toString())));
            props.setProperty("batteriesAA",aaTxt.getText().toString());
            props.setProperty("batteriesD",dTxt.getText().toString());
            // ports
            if (dvidTxt.getText().toString().equals("")) dvidTxt.setText("0");
            if (parallelTxt.getText().toString().equals("")) parallelTxt.setText("0");
            if (ps2Txt.getText().toString().equals("")) ps2Txt.setText("0");
            if (rj45Txt.getText().toString().equals("")) rj45Txt.setText("0");
            if (serialTxt.getText().toString().equals("")) serialTxt.setText("0");
            if (stereoRCATxt.getText().toString().equals("")) stereoRCATxt.setText("0");
            String dvidQuantity = dvidTxt.getText().toString();
            String parallelQuantity = parallelTxt.getText().toString();
            String ps2Quantity = ps2Txt.getText().toString();
            String rj45Quantity = rj45Txt.getText().toString();
            String serialQuantity = serialTxt.getText().toString();
            String stereoRCAQuantity = stereoRCATxt.getText().toString();
            props.setProperty("dvidQuantity",dvidQuantity);
            props.setProperty("parallelQuantity",parallelQuantity);
            props.setProperty("ps2Quantity",ps2Quantity);
            props.setProperty("rj45Quantity",rj45Quantity);
            props.setProperty("serialQuantity",serialQuantity);
            props.setProperty("stereoRCAQuantity",stereoRCAQuantity);
            int ports = 0;
            ports += Integer.parseInt(dvidQuantity) + Integer.parseInt(parallelQuantity) +
                    Integer.parseInt(ps2Quantity) + Integer.parseInt(rj45Quantity) +
                    Integer.parseInt(serialQuantity) + Integer.parseInt(stereoRCAQuantity);
            props.setProperty("totalPorts",String.valueOf(ports));
            if (modPortTxt.getText().toString().equals("")) modPortTxt.setText("0");
            ports += Integer.parseInt(modPortTxt.getText().toString());
            props.setProperty("totalPortsPlusMods",String.valueOf(ports));
            int portTypes = 0;
            if (Integer.parseInt(dvidQuantity) > 0) {
                props.setProperty("dvid","1");
                portTypes++;
            }
            else props.setProperty("dvid","0");
            if (Integer.parseInt(parallelQuantity) > 0) {
                props.setProperty("parallel","1");
                portTypes++;
            }
            else props.setProperty("parallel","0");
            if (Integer.parseInt(ps2Quantity) > 0) {
                props.setProperty("ps2","1");
                portTypes++;
            }
            else props.setProperty("ps2","0");
            if (Integer.parseInt(rj45Quantity) > 0) {
                props.setProperty("rj45","1");
                portTypes++;
            }
            else props.setProperty("rj45","0");
            if (Integer.parseInt(serialQuantity) > 0) {
                props.setProperty("serial", "1");
                portTypes++;
            }
            else props.setProperty("serial","0");
            if (Integer.parseInt(stereoRCAQuantity) > 0) {
                props.setProperty("stereoRCA","1");
                portTypes++;
            }
            else props.setProperty("stereoRCA","0");
            props.setProperty("totalPortTypes",String.valueOf(portTypes));
            // SN
            sn = snTxt.getText().toString();
            String snTemp = sn;
            String[] snArr = string.removeLast(string.moveOnceLeft(sn.split("")));
            try {
                props.setProperty("sn1",snArr[0]);
            } catch (ArrayIndexOutOfBoundsException ex) {
                props.setProperty("sn1","B");
            }
            try {
                props.setProperty("sn2",snArr[1]);
            } catch (ArrayIndexOutOfBoundsException ex) {
                props.setProperty("sn2","B");
            }
            try {
                props.setProperty("sn3",snArr[2]);
            } catch (ArrayIndexOutOfBoundsException ex) {
                props.setProperty("sn3","B");
            }
            try {
                props.setProperty("sn4",snArr[3]);
            } catch (ArrayIndexOutOfBoundsException ex) {
                props.setProperty("sn4","0");
            }
            try {
                props.setProperty("sn5",snArr[4]);
            } catch (ArrayIndexOutOfBoundsException ex) {
                props.setProperty("sn5","0");
            }
            try {
                props.setProperty("sn6",snArr[5]);
            } catch (ArrayIndexOutOfBoundsException ex) {
                props.setProperty("sn6","0");
            }
            String vowel = "f";
            for (String s : snArr) if (string.isVowel(s)) vowel = "t";
            props.setProperty("snVowel",vowel);
            props.setProperty("snFirstDig",String.valueOf(string.firstInt(sn)));
            props.setProperty("snLastDig",String.valueOf(string.lastInt(sn)));
            props.setProperty("snTotalDigs",String.valueOf(string.totalDigits(sn)));
            props.setProperty("snTotalLets",String.valueOf(string.totalLetters(sn)));
            // Modules
            if (moduleTxt.getText().toString().equals("")) moduleTxt.setText("0");
            props.setProperty("modules",moduleTxt.getText().toString());
            // Plates
            if (plateTxt.getText().toString().equals("")) plateTxt.setText("0");
            props.setProperty("plates",plateTxt.getText().toString());
            // Mod Indicators
            props.setProperty("modInd",modIndTxt.getText().toString());
            // Mod Ports
            props.setProperty("modPort",modPortTxt.getText().toString());
            try {
                FileWriter writer = new FileWriter(Props.configFile);
                props.store(writer,"settings");
            } catch (Exception ex) {
                System.out.println("Exception occurred when trying to save! (Probably an IO Exception) printing stack trace...");
                ex.printStackTrace();
            }
            Toast.makeText(getActivity(),"Saved!",Toast.LENGTH_SHORT).show();
        });
        // clear button
        currNormalBtn = sv.findViewById(R.id.clearBtn);
        currNormalBtn.setOnClickListener((View v) -> {
            // indicators
            bobCB.setSelected(false);
            bobLitCB.setSelected(false);
            carCB.setSelected(false);
            carLitCB.setSelected(false);
            clrCB.setSelected(false);
            clrLitCB.setSelected(false);
            frkCB.setSelected(false);
            frkLitCB.setSelected(false);
            frqCB.setSelected(false);
            frqLitCB.setSelected(false);
            indCB.setSelected(false);
            indLitCB.setSelected(false);
            msaCB.setSelected(false);
            msaLitCB.setSelected(false);
            nsaCB.setSelected(false);
            nsaLitCB.setSelected(false);
            sigCB.setSelected(false);
            sigLitCB.setSelected(false);
            sndCB.setSelected(false);
            sndLitCB.setSelected(false);
            trnCB.setSelected(false);
            trnLitCB.setSelected(false);
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
        if (isEven) {
            // if it's an odd number, add 1 to make it even
            if (curr % 2 == 1) curr++;
            // if it's even, add 2
            else curr += 2;
        } else {
            curr++;
        }
        // return string
        return String.valueOf(curr);
    }
    private String remove(EditText text, boolean isEven) {
        // convert
        int curr = convert(text);
        // if it's 0, then don't remove
        if (curr != 0)
            // check need for even
            if (isEven) {
                // if it's an odd number, remove 1 to make it even
                if (curr % 2 == 1) curr--;
                // if it's even, remove 2
                else curr -= 2;
            } else curr--;
        // return the converted string
        return String.valueOf(curr);
    }
    private int convert(EditText text) {
        // text -> string
        String curr = text.getText().toString();
        // if it's empty/has non-digits, use 0 instead
        int currInt = 0;
        // otherwise just convert
        if (!curr.equals("") && android.text.TextUtils.isDigitsOnly(curr)) currInt = Integer.parseInt(curr);
        // return int
        return currInt;
    }
}
