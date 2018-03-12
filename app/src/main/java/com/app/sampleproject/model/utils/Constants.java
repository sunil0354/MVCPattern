package com.app.sampleproject.model.utils;

import android.content.Context;

/**
 * Created by Sunil(sunil0354@gmail.com)
 */

public class Constants
{
    // DECLARATIONS//
    private Context context;
    //VALUES//
    public static String LAST_ACTIVITY="";
    public static String BASE_URL = "";
    public static String BASE_IMAGE_URL = "";
    //KEY//
    //METHODS//
    Constants(Context context) {
        this.context = context;
    }

    /*
    change given date into milliseconds
     */
//    public Long changeDateIntoMilliseconds(String date){
//        Long result = null;
//        @SuppressLint("SimpleDateFormat") SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        try {
//            Date mDate = sdf.parse(date);
//            result=mDate.getTime();
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        return result;
//    }

    /*
    code used to load url into webview
     */
//        WebSettings webSettings = webview.getSettings();
//        webSettings.setJavaScriptEnabled(true);
//        webview.loadUrl(model.getSite_url());
//        webview.setWebViewClient(new WebViewClient() {
//            public void onPageFinished(WebView view, String url) {
//                AppController.constants.dismissProgressDialog();
//            }
//        });

    /*
    Finish the application with clearing its all activity from the stack
     */
//    public void finishApplication(Activity activity){
//        Intent intent = new Intent(Intent.ACTION_MAIN);
//        intent.addCategory(Intent.CATEGORY_HOME);
//        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
//        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        activity.startActivity(intent);
//    }

    /*
    change the date format into another format
     */
//    public String changeDateFormatFromAnother(String date){
//        @SuppressLint("SimpleDateFormat") DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        @SuppressLint("SimpleDateFormat") DateFormat outputFormat = new SimpleDateFormat("dd MMMM yyyy");
//        String resultDate = "";
//        try {
//            resultDate=outputFormat.format(inputFormat.parse(date));
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        return resultDate;
//    }

    /*
    to get youtube video's thumbnail
     */
//    public String getThumbnailOfYoutubeVideo(String youtube_url){
//        String url="";
//        try {
//            url = "https://img.youtube.com/vi/"+youtube_url.split("\\=")[1]+"/0.jpg";
//        }catch (Exception e){
//            url="";
//        }
//        return url;
//    }

    /*
    Used to get the device unique id
     */
//    @SuppressLint("HardwareIds")
//    public String getDeviceID(){
//        return Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);
//    }

    /*
    used to set the color
     */
//    public int setcolor(Context context, int color){
//        return ContextCompat.getColor(context, color);
//    }

    /*
    used to return the typeface
     */
//    public Typeface setTypeface(Context context){
//        return Typeface.createFromAsset(context.getAssets(), "WorkSans_Bold.ttf");
//    }

    /*
    used to show the datepicker
     */
//    public void showTimePicker(Context context, final TextView textView) {
//        Calendar mcurrentTime = Calendar.getInstance();
//        TimePickerDialog mTimePicker = new TimePickerDialog(context,R.style.DatePickerTheme, new TimePickerDialog.OnTimeSetListener() {
//            @SuppressLint("SetTextI18n")
//            @Override
//            public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
//                textView.setText( selectedHour + ":" + selectedMinute);
//            }
//        }, mcurrentTime.get(Calendar.HOUR_OF_DAY), mcurrentTime.get(Calendar.MINUTE), false);//No 24 hour time
////        mTimePicker.setTitle("Select Time");
//        mTimePicker.show();
//    }

    /*
     show calendar with default theme
    */
//    public void showDatePicker(Context context, final TextView textView) {
//        /*
//        used to change the default theme of Datepicker, add this in style
//
//           <!--used to change the default theme of datepicker and timepicker-->
//             <style name="DatePickerTheme" parent="Theme.AppCompat.Light.Dialog">
//             <item name="colorAccent">@color/colorYellow</item>
//           </style>
//
//         */
//        final Calendar calendar = Calendar.getInstance();
//        DatePickerDialog dialog = new DatePickerDialog(context,R.style.DatePickerTheme, new DatePickerDialog.OnDateSetListener() {
//            @Override
//            public void onDateSet(DatePicker arg0, int year, int month, int day_of_month) {
//                calendar.set(Calendar.YEAR, year);
//                calendar.set(Calendar.MONTH, (month));
//                calendar.set(Calendar.DAY_OF_MONTH, day_of_month);
////                String myFormat = "ddMMMMyyyy";
//                String myFormat = "yyyy-MM-dd";
//                SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.getDefault());
//                textView.setText(sdf.format(calendar.getTime()));
//            }
//        },calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH));
//        dialog.getDatePicker().setMinDate(calendar.getTimeInMillis());// TODO: used to hide previous date,month and year
////        calendar.add(Calendar.YEAR, 0);
////        dialog.getDatePicker().setMaxDate(calendar.getTimeInMillis());// TODO: used to hide future date,month and year
//        dialog.show();
//    }

    /*
    hide keyboard in fragment
     */
//    public void hideKeyboardInFragment(Activity activity){
//        activity.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
//    }


    /*
    open our app in the Playstore
     */
//    public void openAppInPlaystore(Context context){
//        context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=chifferobe.app.com.chifferobe")));
//    }

    /*
    Start new Activity with passing the Hashmap
     */
//    public  void startNewActivityByPassingHashmap(Context context, Activity page, HashMap<String,String> hashMap) {
//        /*
//        How to use
//        startNewctivity(this,new MainActivity(),hashmap)
//         */
//        context.startActivity(new Intent(context,page.getClass()).putExtra(ConstantsKey.HASHMAP,hashMap));
////        ((Activity) context).finish();
//        /*
//        To get in second class
//         if (getIntent().getExtras()!= null) {
//            HashMap<String, String> hashMap = (HashMap<String, String>)getIntent().getSerializableExtra(ConstantsKey.HASHMAP);
//        }
//         */
//    }

    /*
    Start the new activity with passing the model class
     */
//    public  void startNewActivityByPassingModelClass(Context context, Activity activity, Model model) {
//        /*
//        Add this dependecny to pass the model class
//            compile 'com.google.code.gson:gson:2.8.2'
//        How to use
//            startNewctivity(this,new MainActivity(),model)
//         */
//        context.startActivity(new Intent(context,activity.getClass()).putExtra(ConstantsKey.MODEL,new Gson().toJson(model)));
//        /*
//        //To get in second class
//         if (getIntent().getExtras() != null) {
//            Model model = new Gson().fromJson(getIntent().getExtras().getString(ConstantsKey.MODEL), new TypeToken<Model>() {}.getType());
//        }
//         */
//    }

    /*
    Method to show the Snackbar using Linearlayout
     */
//    public void showSnackbar(final Context context, final LinearLayout linearLayout, final String string) {
//        /*
//        Add dependency
//        compile 'com.android.support:design:25.3.1'
//         */
//        snackbar = Snackbar.make(linearLayout, string, Snackbar.LENGTH_SHORT).
//                setAction("", new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        snackbar.dismiss();
//
//                    }
//                });
////        snackbar.setActionTextColor(ContextCompat.getColor(context, R.color.colorGreen));
//        View snackbarView = snackbar.getView();
//        snackbarView.setBackgroundColor(ContextCompat.getColor(context, R.color.colorGreenLight));
//        TextView textView = (TextView) snackbarView.findViewById(android.support.design.R.id.snackbar_text);
//        textView.setTextColor(ContextCompat.getColor(context, R.color.colorWhite));
//        textView.setTypeface(Typeface.createFromAsset(context.getAssets(), "verdana.ttf"));
//        textView.setMaxLines(5);
//        snackbar.show();
//    }

    /*
        Method to show the Snackbar using Relativelayout
     */
//    public void showSnackbar(final Context context, final RelativeLayout relativeLayout, final String string) {
//        //Add dependency compile 'com.android.support:design:25.3.1'
//        snackbar = Snackbar.make(relativeLayout, string, Snackbar.LENGTH_SHORT).
//                setAction("", new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        snackbar.dismiss();
//
//                    }
//                });
////        snackbar.setActionTextColor(ContextCompat.getColor(context, R.color.colorGreen));
//        View snackbarView = snackbar.getView();
//        snackbarView.setBackgroundColor(ContextCompat.getColor(context, R.color.colorBlack));
//        TextView textView = (TextView) snackbarView.findViewById(android.support.design.R.id.snackbar_text);
//        textView.setTextColor(ContextCompat.getColor(context, R.color.colorWhite));
//        textView.setTypeface(Typeface.createFromAsset(context.getAssets(), "OpenSans-ExtraBold_0.ttf"));
//        textView.setMaxLines(5);
//        snackbar.show();
//    }

    /*
    method to convert the Imageview's image into the base64 format
     */
//    public String convertImageViewIntoBase64(ImageView imageView) {
//        imageView.buildDrawingCache();
//        Bitmap bmap = imageView.getDrawingCache();
//        ByteArrayOutputStream stream = new ByteArrayOutputStream();
//        bmap.compress(Bitmap.CompressFormat.JPEG, 90, stream);
//        byte[] byteFormat = stream.toByteArray();
//        String imgString = Base64.encodeToString(byteFormat, Base64.NO_WRAP);
//        return imgString;
//    }

    /*
    method that is used to clear all editext's value at simultaneously at same time
     */
//    public void clearAllEditext(final ArrayList<EditText> list)
//    {
//        for (EditText edittext : list)
//        {
//            edittext.setText("");
//        }
//    }

    /*
    method that is used to convert jwt response into JSON object
     */
//    public static JSONObject convertResponse(String response)
//    {
//        /*
//         ADD DEPENDENCY     compile 'io.jsonwebtoken:jjwt:0.6.0'
//        ADD  packagingOptions {
//        exclude 'META-INF/NOTICE'
//        exclude 'META-INF/LICENSE'
//        exclude 'META-INF/DEPENDENCIES'
//    }BELOW buildTypes
//         */
//        try
//        {
//            JSONObject jsonObject = new JSONObject(response);
//            String str_response = jsonObject.getString("jwt");
//            Jws<Claims> claims = Jwts.parser().setSigningKey(Constants.getBase64()).parseClaimsJws(str_response);
//            JSONObject object = new JSONObject(claims.getBody());
//            return object;
//        }
//        catch (Exception e1)
//        {
//            e1.printStackTrace();
//            return null;
//        }
//    }

    /*
    create the file from bitmap
     */
//    public static File createFileFromBitmap(Bitmap bmp, Context context)
//    {
//        //ADD DEPENDENCY compile 'id.zelory:compressor:1.0.4'
//        try
//        {
//            //create a file to write bitmap data
//            File file = new File(context.getCacheDir(), System.currentTimeMillis() + ".jpg");
//            if (file.exists())
//                file.delete();
//            file.createNewFile();
//        //Convert bitmap to byte array
//            Bitmap bitmap = bmp;
//            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//            bitmap.compress(Bitmap.CompressFormat.PNG, 90 /*ignored for PNG*/, byteArrayOutputStream);
//            byte[] bitmapdata = byteArrayOutputStream.toByteArray();
//        //write the bytes in file
//            FileOutputStream fileOutputStream = new FileOutputStream(file);
//            fileOutputStream.write(bitmapdata);
//            fileOutputStream.flush();
//            fileOutputStream.close();
//            return Compressor.getDefault(context).compressToFile(file);
//        //   return f;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//    }

    /*
    show the alert dialog with different situation
     */
//    public  void showAlertDialog(final Context context, String message, final int value)
//    {
//        alertDialog = new AlertDialog.Builder(context);
//        alertDialog.setMessage(message);
//        alertDialog.setNegativeButton("Ok", new DialogInterface.OnClickListener()
//        {
//            public void onClick(DialogInterface dialog, int which) {
//                switch (value)
//                {
//                }
//            }
//        });
//        alertDialog.setPositiveButton("Cancel", new DialogInterface.OnClickListener() {
//            public void onClick(DialogInterface dialog, int which)
//            {
//                    dialog.dismiss();
//            }
//        });
//        alertDialog.show();
//    }

    /*
       show the progress dialog visible to user
    */
//    public void showProgressDialog(Context context) {
////        dialog = new ProgressDialog(context);
////        dialog.setMessage("Please wait.");
////        dialog.setCancelable(false);
////        dialog.show();
////        alertDialog = new SpotsDialog(context, R.style.Custom);
////        alertDialog.setCancelable(false);
////        alertDialog.show();
//        dialog = new Dialog(context);
//        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
//        dialog.setContentView(R.layout.dialog_progress);
//        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
//        dialog.setCancelable(false);
//        dialog.show();
//    }

    /*
    Dismiss the progress dialog
     */
//    public void dismissProgressDialog() {
//        if (dialog.isShowing()) {
//            dialog.dismiss();
//        }
//    }

    /*
    Hide keyboard on the screen in Activity
     */
//    public  void hideKeyboardOfActivity(Activity activity) {
//        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService(Activity.INPUT_METHOD_SERVICE);
//        View view = activity.getCurrentFocus();
//        if (view == null) {
//            view = new View(activity);
//        }
//        assert inputMethodManager != null;
//        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
//    }

    /*
   shows keyboard on screen
    */
//    public  void showKeyboard(Activity activity, EditText editText)
//    {
//        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE);
//        if (inputMethodManager != null) {
//            inputMethodManager.showSoftInput(editText, InputMethodManager.SHOW_IMPLICIT);
//        }
//    }

    /*
    Shows the current time and date
     */
//    public  String showCurrentDateandTime()
//    {
//        Calendar calender = Calendar.getInstance();
//        @SuppressLint("SimpleDateFormat") SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String date = simpleDateFormat.format(calender.getTime());
//        return date;
//    }

    /*
    convert the string into double and return upto 2 decimal string
     */
//    public  String convertStringToDouble(final String string)
//    {
//        Double value = parseStringToDouble(String.valueOf(string));
//        return String.format("%.2f", value);
//    }

    /*
    prevent null object refrence if the string is empty
    */
//    public  double parseStringToDouble(String string)
//    {
//        if (string != null && string.length() > 0)
//        {
//            try
//            {
//                return Double.parseDouble(string);
//            }
//            catch (Exception e)
//            {
//                return -1;
//            }
//        } else return 0;
//    }

    /*
    convert float into int
     */
//    public  int convertFloatToInt(final float value)
//    {
//        int finalValue=(int)value;
//        return finalValue;
//    }

    /*
    check that string is numeric to not
     */
//    public  boolean checkStringIsNumeric(final String value)
//    {
//        try
//        {
//            double tempValue = Double.parseDouble(value);
//        }
//        catch (NumberFormatException nfe)
//        {
//            return false;
//        }
//        return true;
//    }

    /*
    convert 24 hours time format into 12 hours time format with AM or PM
     */
//    public  String convertTime24HrsTo12HrsFormat(final int int_hours, final int int_minute)
//    {
//        StringBuilder stringBuilder = new StringBuilder();
//        try
//        {
//            if(int_hours>=12)
//            {
//                stringBuilder.append(int_hours-12).append(":").append(String.format("%02d", int_minute)).append("p");
//            }
//            else
//            {
//                stringBuilder.append(int_hours).append(":").append(String.format("%02d", int_minute)).append("a");
//            }
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//            Log.e(TAG, "Error in convertTime24HrsTo12HrsFormat: "+e);
//        }
//        return String.valueOf(stringBuilder);
//    }

    /*
    compare two different time periods
     */
//    public  boolean compareTwoTime(String starttime, String endtime)
//    {
//        String pattern = "HH:mm";
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//        try
//        {
//            Date date_starttime = simpleDateFormat.parse(starttime);
//            Date date_endtime = simpleDateFormat.parse(endtime);
//            if(date_starttime.before(date_endtime))
//            {
//                return true;
//            }
//            else
//            {
//                return false;
//            }
//        } catch (ParseException e)
//        {
//            e.printStackTrace();
//            Log.e(TAG, "Error in compareTwoTime: "+e );
//        }
//        return false;
//    }

    /*
    convert string into decimal upto 2 decimals
     */
//    public  String convertStringUpto2Decimal(final String value)
//    {
//        Double tempValue=Double.parseDouble(value);
//        return String.format("%.2f",tempValue );
//    }

    /*
    convert timestamp into ago format
     */
//    public  String convertTimeStampintoAgo(Long timeStamp)
//    {
//        /*
//        Add this dependency
//        org.ocpsoft.prettytime:prettytime:4.0.1.Final
//         */
//        try
//        {
//            Calendar calender = Calendar.getInstance(Locale.getDefault());
//            calender.setTimeInMillis(timeStamp);
//            String date = android.text.format.DateFormat.format("yyyy-MM-dd HH:mm:ss", calender).toString();
//            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
//            Date dateObj = simpleDateFormat.parse(date);
//            PrettyTime prettyTime = new PrettyTime();
//            return prettyTime.format(dateObj);
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//        return "";
//    }

    /*
    used to load the api into your webbrowser
     */
//    public void loadApiToUrl(String settitle)
//    {
//        WebView wb_webview = null;
//        String postData = null;
//        try
//        {
//            postData = "page=" + URLEncoder.encode(settitle, "UTF-8");
//            //page= is paremeter which we are sending to api
//        }
//        catch (UnsupportedEncodingException e)
//        {
//            e.printStackTrace();
//            Log.e(TAG, "Error in loadApiToUrl: "+e );
//        }
//        wb_webview.postUrl("url name",postData.getBytes());
//    }

	/*
	used to get thumbnail from video that is on URL
	NOTE:-
	1. Url contains video only (it does not have other data)
	2. Internet permission is mandatory
	*/
//	public  Bitmap getVideoFrameFromUrl(String videoPath) throws Throwable
//    {
//        Bitmap bitmap = null;
//        MediaMetadataRetriever mediaMetadataRetriever = null;
//        try
//        {
//            mediaMetadataRetriever = new MediaMetadataRetriever();
//            if (Build.VERSION.SDK_INT >= 14)
//                mediaMetadataRetriever.setDataSource(videoPath, new HashMap<String, String>());
//            else
//                mediaMetadataRetriever.setDataSource(videoPath);
//            bitmap = mediaMetadataRetriever.getFrameAtTime();
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//            throw new Throwable("Exception in retriveVideoFrameFromVideo(String videoPath)" + e.getMessage());
//        }
//        finally
//        {
//            if (mediaMetadataRetriever != null)
//            {
//                mediaMetadataRetriever.release();
//            }
//        }
//        return bitmap;
//    }

    /*
    method to print all the value simulateneuosly in the log
     */
//    public void printLogOfAllValues(String key, String value) {
//        HashMap<String,String> hashmap=new HashMap<String,String>();
//        hashmap.put(key, value);
//        for (Map.Entry<String, String> mapEntry : hashmap.entrySet())
//        {
//            String key1 = mapEntry.getKey();
//            String value1 = mapEntry.getValue();
//            Log.e("TAG","\n"+key1+"="+value1);
//        }
//    }

    /*
    overiding method becouse to finish the activity wheather its from back icon or back pressed
     */
//    @Override
//    public void onBackPressed()
//    {
//        super.onBackPressed();
//        finish();
//    }

    /*
    method to check email is valid format or not
     */
//    public boolean isEmailValid(String email) {
//        Pattern pattern;
//        Matcher matcher;
//        final String EMAIL_PATTERN = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
//        pattern = Pattern.compile(EMAIL_PATTERN);
//        matcher = pattern.matcher(email);
//        return matcher.matches();
//    }

    /*
    check internet is available or not
     */
//    public boolean isInternetConnected(Context context) {
//        boolean haveConnectedWifi = false;
//        boolean haveConnectedMobile = false;
//        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
//        NetworkInfo[] netInfo = cm.getAllNetworkInfo();
//        for (NetworkInfo ni : netInfo) {
//            if (ni.getTypeName().equalsIgnoreCase("WIFI"))
//                if (ni.isConnected())
//                    haveConnectedWifi = true;
//            if (ni.getTypeName().equalsIgnoreCase("MOBILE"))
//                if (ni.isConnected())
//                    haveConnectedMobile = true;
//        }
//        return haveConnectedWifi || haveConnectedMobile;
//    }

}