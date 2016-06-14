package com.drawthink.iguyuan.manager;

import java.util.List;

import com.drawthink.iguyuan.model.ConvenientBanner;
import com.drawthink.iguyuan.model.Splash;

public interface AdvertisementManager {

	Splash getSplash();

	List<ConvenientBanner> getConvenientBanner();

}
